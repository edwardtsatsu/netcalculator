package com.netcalculator.netcalculator.service;

public interface EmployerTax {
    double calculateEmployerPensionAmount(double allowance);

    double calculateTierOneAndTierThree(double allowance);
}