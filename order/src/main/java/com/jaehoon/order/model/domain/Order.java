package com.jaehoon.order.model.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Order implements Serializable {
    private Integer id;
    private String orderer;
    private String product;
}
