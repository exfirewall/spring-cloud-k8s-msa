package com.jaehoon.product.controller;

import com.jaehoon.product.controller.type.RestResponse;
import com.jaehoon.product.model.domain.Product;
import com.jaehoon.product.model.type.StatusCode;
import com.jaehoon.product.model.value.ProductRequest;
import com.jaehoon.product.model.value.ProductResponse;
import com.jaehoon.product.service.AddProduct;
import com.jaehoon.product.service.GetProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private GetProduct getProduct;

    @Autowired
    private AddProduct addProduct;

    @GetMapping("{id}")
    public RestResponse<ProductResponse> getProduct(@PathVariable Integer id){
        RestResponse<ProductResponse> response = new RestResponse<>(StatusCode.OK);
        Product product = getProduct.getProduct(id);
        ProductResponse result = new ProductResponse();
        result.setProduct(product);
        response.setResult(result);

        return response;
    }

    @PostMapping("new")
    public RestResponse<ProductResponse> addProduct(@RequestBody ProductRequest productRequest){
        RestResponse<ProductResponse> response = new RestResponse<>(StatusCode.CREATED);
        response.setResult(addProduct.add(productRequest));
        return response;
    }
}
