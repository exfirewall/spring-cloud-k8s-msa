package com.jaehoon.product.repository;

import com.jaehoon.product.model.domain.Product;

public interface JdbcRepository {

    Product findById(Integer id);
}
