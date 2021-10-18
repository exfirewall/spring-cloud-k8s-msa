package com.jaehoon.product.service;

import com.jaehoon.product.model.domain.Product;
import com.jaehoon.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetProduct {

    @Autowired
    private ProductRepository productRepository;

    public Product getProduct (Integer id){
        return productRepository.findById(id);
    }
}
