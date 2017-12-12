package com.backend.dao;

import com.backend.model.Product;

import java.util.List;

/**
 * Created by abin on 12/12/2017.
 */
public interface ProductDao {
    void insert(Product product);
    List<Product> listAll();
}
