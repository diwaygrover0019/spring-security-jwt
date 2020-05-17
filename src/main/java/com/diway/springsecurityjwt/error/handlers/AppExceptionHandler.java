package com.diway.springsecurityjwt.error.handlers;

import com.diway.springsecurityjwt.error.exceptions.AppRuntimeException;
import com.diway.springsecurityjwt.models.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AppRuntimeException.class)
    @ResponseBody
    protected ResponseEntity<ErrorResponse> appRuntimeException(WebRequest request, AppRuntimeException ex) {
        ErrorResponse errorResponse = new ErrorResponse()
                .setMessage(ex.getMessage())
                .setStatus(ex.getHttpStatus().value());

        return new ResponseEntity(errorResponse, ex.getHttpStatus());
    }
}
