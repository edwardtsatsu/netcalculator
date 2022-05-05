package com.netcalculator.netcalculator.service;

public interface Taxable {
    double calculateTotalPayETax(double assumedGross, double net, double allowance);

    double calculateTaxPayPercentage(double assumedGross);
}