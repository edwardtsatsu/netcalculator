package com.netcalculator.netcalculator.service;

public interface TaxCalculation {
    double calculateBasicPay(double netPay, double allowance);

    double calculateActualGross();

    double calculateTierOneAndTierThree();

    double calculateTierTwoAndTierThree();

    double calculateEmployerPensionContributionAmount();

    double calculateTotalPayETax();

    double calculateEmployerPensionAmount();
}
