package com.backend.controller;

import com.backend.model.Product;
import com.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by abin on 12/12/2017.
 */
@Controller
public class DefaultController {

    @Autowired
    private ProductService productService;

   @GetMapping({"/","/index"})
    public String index(){
        return "index";
    }
    @GetMapping({"/test"})
    public String test(){
        return "test";
    }

//    @GetMapping("/product")
//    public String listAll(Model model){
//        model.addAttribute("productList",productService.listAll());
//        return "product";
//    }
//
    @RequestMapping(value = "/save",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Product product){
        productService.insert(product);


    }
}
