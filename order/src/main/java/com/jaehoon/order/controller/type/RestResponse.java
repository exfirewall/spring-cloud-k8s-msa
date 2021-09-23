package com.jaehoon.order.controller.type;

import com.jaehoon.order.model.type.StatusCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
public class RestResponse<T extends Serializable> {
    private String resultCode;
    private String resultMessage;
    public @Setter T result;

    public RestResponse(StatusCode code){
        this.resultCode = code.getCode();
        this.resultMessage = code.getMessage();

    }
}
