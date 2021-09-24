package com.jaehoon.order.controller;

import com.jaehoon.order.controller.type.RestResponse;
import com.jaehoon.order.model.param.CreateOrderRequest;
import com.jaehoon.order.model.type.StatusCode;
import com.jaehoon.order.service.CreateOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private CreateOrder createOrder;

    public RestResponse<String> createOrder(@RequestBody CreateOrderRequest bodyRequest){
        RestResponse<String> restResponse = new RestResponse<>(StatusCode.CREATED);

        return restResponse;
    }
}
