package com.backend.service;

import com.backend.model.Product;

import java.util.List;

/**
 * Created by abin on 12/12/2017.
 */
public interface ProductService {
    void insert(Product product);
    List<Product> listAll();
}
