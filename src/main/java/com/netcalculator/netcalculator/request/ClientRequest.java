package com.netcalculator.netcalculator.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientRequest {
    private double net;
    private double allowance;
}