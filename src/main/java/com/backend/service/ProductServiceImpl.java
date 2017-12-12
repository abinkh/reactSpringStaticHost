package com.backend.service;

import com.backend.dao.ProductDao;
import com.backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by abin on 12/12/2017.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public void insert(Product product) {
        productDao.insert(product);
    }

    @Override
    public List<Product> listAll() {
        return productDao.listAll();
    }
}
