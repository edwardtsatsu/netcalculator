package com.netcalculator.netcalculator.service;

public interface Taxable {
    double calculateTotalPayETax(double gross,double allowance);

    double calculateTaxPayPercentage(double assumedGross);
}