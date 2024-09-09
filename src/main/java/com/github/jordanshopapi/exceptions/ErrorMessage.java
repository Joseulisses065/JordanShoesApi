package com.github.jordanshopapi.exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.Map;

public class ErrorMessage {
    private String path;
    private String method;
    private String statusText;
    private int statusCode;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, String> errors;

    public ErrorMessage(HttpServletRequest request, HttpStatus status, String message) {
        this.path = request.getContextPath();
        this.method = request.getMethod();
        this.statusText = status.getReasonPhrase();
        this.statusCode = status.value();
        this.message = message = message;
    }
    public ErrorMessage(HttpServletRequest request, HttpStatus status, String message, BindingResult result) {
        this.path = request.getContextPath();
        this.method = request.getMethod();
        this.statusText = status.getReasonPhrase();
        this.statusCode = status.value();
        this.message = message = message;
        addErrors(result);
    }

    private void addErrors(BindingResult result) {
        for(FieldError error: result.getFieldErrors()){
            this.errors.put(error.getField(), error.getDefaultMessage());
        }
    }

}
