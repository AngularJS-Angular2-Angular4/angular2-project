package com.centurylink.pctl.mod.user.domain.utils;

import org.springframework.http.HttpStatus;

/**
 * Created by haribabu.ka on 14-10-2016.
 */
public enum StatusCode {

    E200("200","Success",HttpStatus.OK),
    E400("400","Bad Request",HttpStatus.NOT_FOUND),
    C401("400","Bad Request - No User Logged in",HttpStatus.NOT_FOUND),
    C402("400","Bad Request - Shipping Address Empty",HttpStatus.NOT_FOUND),
    C403("400","Bad Request - Service and Shipping Address Empty",HttpStatus.NOT_FOUND),
    C406("502","WSDL - Response is Null",HttpStatus.BAD_GATEWAY),
    E401("101-1","Invalid User",HttpStatus.NOT_FOUND),
    E402("101-2","PostalAddressValidationRequest clientId must exist",HttpStatus.NOT_FOUND),
    E403("101-3","PostalAddressValidationRequest clientId invalid",HttpStatus.NOT_FOUND),
    E404("101-4","PostalAddressValidationRequest input Address must exist",HttpStatus.NOT_FOUND),
    E405("101-5","InputAddress address Line1 must exist",HttpStatus.NOT_FOUND),
    E406("101-6","InputAddress address Line1: Invalid Format or Length",HttpStatus.NOT_FOUND),
    E407("101-7","InputAddress address Line2: Invalid Format or Length",HttpStatus.NOT_FOUND),
    E408("101-8","InputAddress locality and InputAddress state Or Province must exist",HttpStatus.NOT_FOUND),
    E409("101-9","InputAddress locality Invalid Format or Length",HttpStatus.NOT_FOUND),
    E4010("101-10","InputAddress state Or Province Invalid Format or Length",HttpStatus.NOT_FOUND),
    E4011("101-11","InputAddress postCode Invalid Format or Length",HttpStatus.NOT_FOUND),
    E4012("101-12","InputAddress addressLine3 is reserved for future use",HttpStatus.NOT_FOUND),
    E4013("101-13","InputAddress country is reserved for future use",HttpStatus.NOT_FOUND),
    E4014("101-14","InputAddress country is reserved for future use",HttpStatus.NOT_FOUND),
    E500("500","Internal Server Error",HttpStatus.INTERNAL_SERVER_ERROR);

    private HttpStatus httpStatus;
    private  String code;
    private  String message;

    StatusCode(String code, String message,HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.httpStatus=httpStatus;
    }


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
