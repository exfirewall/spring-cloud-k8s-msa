package com.jaehoon.order.controller;

import com.jaehoon.order.controller.type.RestResponse;
import com.jaehoon.order.model.domain.Order;
import com.jaehoon.order.model.param.CreateOrderRequest;
import com.jaehoon.order.model.type.StatusCode;
import com.jaehoon.order.service.CreateOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/order/", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
    @Autowired
    private CreateOrder createOrder;

    @PostMapping("/new")
    public RestResponse<Order> createOrder(@RequestBody CreateOrderRequest bodyRequest){
        RestResponse<Order> restResponse = new RestResponse<>(StatusCode.CREATED);
        Order order = createOrder.loadDomain();
        log.debug("order check" + order.getOrderer());
        restResponse.setResult(order);

        return restResponse;
    }
}
