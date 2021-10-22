package com.jaehoon.order.model.type;

public enum ErrorCode {
    SUCCESS("00000", "성공"), RUNTIME_EXCEPTION("01000", "기타RUNTIME오류"),
    SYNTAX_URL("01001", "URL구문오류"), BAD_REQUEST("01002", "파라미터오류"),
    NOT_FOUND("01101", "Resource없음")
    ;

    private final String code;
    private final String phrase;

    ErrorCode(String code, String phrase) {
        this.code = code;
        this.phrase = phrase;
    }

    public String getCode() {
        return this.code;
    }

    public String getPhrase() {
        return this.phrase;
    }
}
