package com.jaehoon.product.service;


import com.jaehoon.product.model.value.ProductRequest;
import com.jaehoon.product.model.value.ProductResponse;
import com.jaehoon.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class AddProduct {
    private final ProductRepository productRepository;

    public AddProduct(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductResponse add(ProductRequest productRequest){
        return productRepository.add(productRequest);
    }
}
