package com.netcalculator.netcalculator.service;

public interface EmployerTax {
    double calculateEmployerPensionAmount(double net, double allowance);

    double calculateTierOneAndTierThree(double net, double allowance);
}