package com.jaehoon.order.repository;


import com.jaehoon.order.model.value.ProductDto;
import com.jaehoon.order.model.value.ProductResponse;
import com.jaehoon.order.model.value.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.net.URI;

@Slf4j
@Repository
public class ProductRepository extends ApiRepository {
    @Value("http://localhost:8082/product")
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public ProductResponse getProductInfo(URI uri, Class<ProductResponse> responseType){
        ProductResponse productResponse = this.get(uri, responseType);
        log.info(productResponse.toString());
        return productResponse;
    }
}
