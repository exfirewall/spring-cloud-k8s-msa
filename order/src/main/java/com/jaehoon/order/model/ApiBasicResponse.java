package com.jaehoon.order.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ApiBasicResponse {
    private String resultCode;
    private String resultMessage;
}
