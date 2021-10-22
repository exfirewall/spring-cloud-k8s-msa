package com.jaehoon.order.controller.error;

import com.jaehoon.order.model.type.ErrorCode;
import com.jaehoon.order.model.type.StatusCode;

public class HttpRestException extends RuntimeException{
    private ExceptionResponse response;

    private StatusCode statusCode;
    private ErrorCode errorCode;

    public HttpRestException(StatusCode statusCode, ErrorCode errorCode){
        super(errorCode.getPhrase());
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        init();
    }

    public HttpRestException(StatusCode statusCode, ErrorCode errorCode, String message){
        super(message);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        init();
    }

    void init() {
        this.response = new ExceptionResponse();
        response.setErrorCode(errorCode.getCode());
        response.setErrorMessage(this.getMessage());
        if (this.getCause() != null) {
            response.setCause(this.getCause().getClass().getName());
        } else {
            response.setCause(this.getClass().getName());
        }
    }

}
