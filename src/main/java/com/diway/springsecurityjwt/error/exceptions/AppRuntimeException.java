package com.diway.springsecurityjwt.error.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class AppRuntimeException extends RuntimeException {

    @Getter
    private HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;

    @Getter
    private Throwable exception;

    public AppRuntimeException(String errorMsg, Throwable ex) {
        super(errorMsg, ex);
    }

    public AppRuntimeException(String errorMsg, HttpStatus httpStatus) {
        super(errorMsg);
        this.httpStatus = httpStatus;
    }

    public AppRuntimeException(String errorMsg, HttpStatus httpStatus, Throwable ex) {
        super(errorMsg, ex);
        this.httpStatus = httpStatus;
        this.exception = ex;
    }
}
