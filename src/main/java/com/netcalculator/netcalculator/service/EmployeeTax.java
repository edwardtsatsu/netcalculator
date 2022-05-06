package com.netcalculator.netcalculator.service;

public interface EmployeeTax {
    double calculateEmployeePensionContributionAmount(double allowance);

    double calculateTierTwoAndTierThree(double allowance);
}