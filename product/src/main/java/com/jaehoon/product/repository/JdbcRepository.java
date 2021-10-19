package com.jaehoon.product.repository;

import com.jaehoon.product.controller.type.RestResponse;
import com.jaehoon.product.model.domain.Product;
import com.jaehoon.product.model.value.ProductRequest;
import com.jaehoon.product.model.value.ProductResponse;

public interface JdbcRepository {

    Product findById(Integer id);

    ProductResponse add(ProductRequest productRequest);
}
