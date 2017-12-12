package com.backend.dao;

import com.backend.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by abin on 12/12/2017.
 */
@Repository
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insert(Product product) {
        Session session=sessionFactory.openSession();
        session.save(product);
        session.beginTransaction().commit();
        session.close();

    }

    @Override
    public List<Product> listAll() {
        return sessionFactory.openSession().createCriteria(Product.class).list();
    }
}
