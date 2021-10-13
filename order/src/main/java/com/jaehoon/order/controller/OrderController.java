package com.jaehoon.order.controller;

import com.jaehoon.order.controller.type.RestResponse;
import com.jaehoon.order.model.domain.Order;
import com.jaehoon.order.model.param.CreateOrderRequest;
import com.jaehoon.order.model.type.StatusCode;
import com.jaehoon.order.model.value.OrderResponse;
import com.jaehoon.order.model.value.OrdersResponse;
import com.jaehoon.order.service.CreateOrder;
import com.jaehoon.order.service.GetOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
    @Autowired
    private CreateOrder createOrder;

    @Autowired
    private GetOrder getOrder;

//    @PostMapping("/new")
//    public RestResponse<Order> createOrder(@RequestBody CreateOrderRequest bodyRequest){
//        RestResponse<Order> restResponse = new RestResponse<>(StatusCode.CREATED);
//        Order order = createOrder.loadDomain();
//        log.debug("order check" + order.getOrdNm());
//        restResponse.setResult(order);
//
//        return restResponse;
//    }

    @GetMapping("/order")
    public RestResponse<OrdersResponse> getOrders(){
        RestResponse<OrdersResponse> response = new RestResponse<>(StatusCode.OK);
        List<Order> orders = getOrder.getAllOrder();
        OrdersResponse result = new OrdersResponse();
        result.setOrders(orders);
        response.setResult(result);

        return response;
    }

    @GetMapping("/order/{id}")
    public RestResponse<OrderResponse> getOrders(@PathVariable String id){
        RestResponse<OrderResponse> response = new RestResponse<>(StatusCode.OK);
        Order order = getOrder.getOrder(id);
        OrderResponse result = new OrderResponse();
        result.setOrder(order);
        response.setResult(result);

        return response;
    }

    @Value("${custom.check-text}")
    private String test;

    @GetMapping("/read")
    public String readTest(){
        return test;
    }
}
