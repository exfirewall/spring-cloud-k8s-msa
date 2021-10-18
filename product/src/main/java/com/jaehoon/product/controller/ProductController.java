package com.jaehoon.product.controller;

import com.jaehoon.product.controller.type.RestResponse;
import com.jaehoon.product.model.domain.Product;
import com.jaehoon.product.model.type.StatusCode;
import com.jaehoon.product.model.value.ProductResponse;
import com.jaehoon.product.service.GetProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private GetProduct productService;

    @GetMapping("{id}")
    public RestResponse<ProductResponse> getProduct(@PathVariable Integer id){
        RestResponse<ProductResponse> response = new RestResponse<>(StatusCode.OK);
        Product product = productService.getProduct(id);
        ProductResponse result = new ProductResponse();
        result.setProduct(product);
        response.setResult(result);

        return response;
    }
}
