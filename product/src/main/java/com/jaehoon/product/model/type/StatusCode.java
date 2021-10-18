package com.jaehoon.product.model.type;

import org.springframework.http.HttpStatus;

public enum StatusCode {
    OK(HttpStatus.OK, "조회성공"),
    CREATED(HttpStatus.CREATED, "UPDATE성공"),
    NOT_MODIFIED(HttpStatus.NOT_MODIFIED, "UPDATE실패"),
    NOT_FOUND(HttpStatus.NOT_FOUND, "Resource없음"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "요청파라미터이상"),
    ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Application오류");

    private final HttpStatus code;
    private final String message;

    StatusCode(HttpStatus code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return String.valueOf(this.code.value());
    }

    public String getMessage() {
        return this.message;
    }

    public static StatusCode getStatusCode(String str) {
        for (StatusCode statusCode : values()) {
            if (statusCode.getCode().equals(str)) {
                return statusCode;
            }
        }
        return StatusCode.ERROR; //OK/CREATED에서 안걸린다면 그냥 ERRORretur
    }
}
