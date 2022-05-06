package com.netcalculator.netcalculator.service;

import static com.netcalculator.netcalculator.service.Accumulator.calculateGross;
import static com.netcalculator.netcalculator.service.impl.EmployerTaxImpl.percentageOfTierOneAndTierThree;

public abstract class EmployerTax {
    static double calculateEmployerPensionAmount(double net, double allowance) {
        return calculateGross(net, allowance) * percentageOfTierOneAndTierThree;
    }
}