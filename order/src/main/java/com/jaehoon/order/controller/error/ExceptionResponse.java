package com.jaehoon.order.controller.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class ExceptionResponse implements Serializable {
    @JsonProperty("error_code")
    private String errorCode;
    @JsonProperty("error_message")
    private String errorMessage;
    @JsonProperty("cause")
    private String cause;
    @JsonProperty("return_url")
    private String url;
}
