package com.netcalculator.netcalculator.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientRequest {
    private Double net;
    private Double allowance;
}