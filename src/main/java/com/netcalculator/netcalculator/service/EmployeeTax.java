package com.netcalculator.netcalculator.service;

import static com.netcalculator.netcalculator.service.Accumulator.calculateGross;
import static com.netcalculator.netcalculator.service.impl.EmployeeTaxImpl.percentageOfTierTwoAndThree;

public abstract class EmployeeTax {
    static double calculateEmployeePensionContributionAmount(double net, double allowance) {
        return calculateGross(net, allowance) * percentageOfTierTwoAndThree;
    }
}