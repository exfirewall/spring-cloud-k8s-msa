package com.jaehoon.order.model.value;

import com.jaehoon.order.model.domain.Order;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class OrdersResponse implements Serializable {
    List<Order> orders;
}
