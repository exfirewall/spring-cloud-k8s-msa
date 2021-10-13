package com.jaehoon.order.repository;

import com.jaehoon.order.model.domain.Order;

import java.util.List;

public interface JdbcRepository {
    List<Order> findAll();

    Order findById(String id);
}
