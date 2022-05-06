package com.netcalculator.netcalculator.exception;

public class GrossCanNotBeLessThanOneException extends RuntimeException {
    public GrossCanNotBeLessThanOneException(String message) {
        super(message);
    }
}
