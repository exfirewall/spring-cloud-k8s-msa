package com.jaehoon.order.model.value;

import com.jaehoon.order.model.domain.Order;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OrderResponse implements Serializable {
    Order order;
}
