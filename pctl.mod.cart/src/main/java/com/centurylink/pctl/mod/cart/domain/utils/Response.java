package com.centurylink.pctl.mod.cart.domain.utils;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.http.HttpStatus;

public class Response<T> {

    private T content;
    private String message;
    private String code;
    private HttpStatus httpStatus;

    public Response() {
    }

    public Response(String code, String message, HttpStatus httpStatus) {
        this.message = message;
        this.code = code;
        this.httpStatus = httpStatus;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void setStatus(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.message =  statusCode.getMessage();
        this.httpStatus = statusCode.getHttpStatus();
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    @JsonIgnore
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
