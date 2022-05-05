package com.netcalculator.netcalculator.service;

public interface Accumulator {
    double calculateBasicSalary(double netPay, double allowance);

    double calculateActualGross(double net, double allowance);
}