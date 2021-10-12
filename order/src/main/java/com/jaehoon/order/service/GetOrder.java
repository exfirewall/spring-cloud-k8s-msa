package com.jaehoon.order.service;

import com.jaehoon.order.model.domain.Order;
import com.jaehoon.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetOrder {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrder(){
        return orderRepository.findAll();
    }

    public Order getOrder(String id){
        return orderRepository.findById(id);
    }
}
