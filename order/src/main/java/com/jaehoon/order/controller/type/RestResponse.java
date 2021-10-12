package com.jaehoon.order.controller.type;

import com.jaehoon.order.model.domain.Order;
import com.jaehoon.order.model.type.StatusCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class RestResponse<T extends Serializable> {
    private String resultCode;
    private String resultMessage;
    private T result;

    public RestResponse(StatusCode code){
        this.resultCode = code.getCode();
        this.resultMessage = code.getMessage();
    }
}
