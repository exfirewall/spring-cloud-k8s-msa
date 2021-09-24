package com.jaehoon.user.controller.type;

import com.jaehoon.user.model.type.StatusCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
public class ApiResponse<T extends Serializable> {
    private String resultCode;

    private String resultMessage;

    public @Setter T result;

    public ApiResponse(StatusCode code){
        this.resultCode = code.getCode();
        this.resultMessage = code.getMessage();
    }
}
