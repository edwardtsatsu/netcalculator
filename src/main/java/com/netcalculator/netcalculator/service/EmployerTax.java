package com.netcalculator.netcalculator.service;

import static com.netcalculator.netcalculator.service.Accumulator.calculateGross;


public abstract class EmployerTax {
    private static final double percentageOfTierOneAndTierThree = 0.15;
    static double calculateEmployerPensionAmount(double net, double allowance) {
        return calculateGross(net, allowance) * percentageOfTierOneAndTierThree;
    }
}