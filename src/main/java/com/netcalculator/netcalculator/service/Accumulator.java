package com.netcalculator.netcalculator.service;

public interface Accumulator {
    double calculateBasicPay(double netPay, double allowance);
    double calculateActualGross();
}