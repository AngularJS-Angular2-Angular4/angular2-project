package com.centurylink.pctl.mod.api.domain.utils;

import com.netflix.ribbon.proxy.annotation.Http;
import org.springframework.http.HttpStatus;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * Created by haribabu.ka on 14-10-2016.
 */
public class Response {

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
