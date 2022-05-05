package com.netcalculator.netcalculator.service;

public interface EmployeeTax {
    double calculateEmployeePensionContributionAmount(double net, double allowance);

    double calculateTierTwoAndTierThree(double net, double allowance);
}