package com.netcalculator.netcalculator.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorResponse {
    private String message;
    private final LocalDateTime timestamp = LocalDateTime.now();
}