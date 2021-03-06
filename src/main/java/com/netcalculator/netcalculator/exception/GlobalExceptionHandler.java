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
    public ResponseEntity<ErrorResponse> GrossCanNotBeLessThanOneException(GrossCanNotBeLessThanOneException grossCanNotBeLessThanOneException, WebRequest webRequest) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(grossCanNotBeLessThanOneException.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.REQUEST_TIMEOUT);
    }

    @ExceptionHandler(BasicSalaryCanNotBeZeroException.class)
    public ResponseEntity<ErrorResponse> BasicSalaryCanNotBeZeroException(BasicSalaryCanNotBeZeroException basicSalaryCanNotBeZeroException, WebRequest webRequest) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(basicSalaryCanNotBeZeroException.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.REQUEST_TIMEOUT);
    }

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorResponse> studentNotFoundException(StudentNotFoundException studentNotFoundException, WebRequest webRequest) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(studentNotFoundException.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}