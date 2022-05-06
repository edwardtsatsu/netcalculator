package com.netcalculator.netcalculator.exception;

import com.netcalculator.netcalculator.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(GrossCanNotBeLessThanOneException.class)
    public ResponseEntity<ErrorResponse> handleAvailabilityNotFoundException(GrossCanNotBeLessThanOneException grossCanNotBeLessThanOneException, WebRequest webRequest) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(grossCanNotBeLessThanOneException.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}