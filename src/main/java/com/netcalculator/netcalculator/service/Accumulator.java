package com.netcalculator.netcalculator.service;

import com.netcalculator.netcalculator.service.impl.EmployeeTaxImpl;

public abstract class Accumulator {

    static double calculateGross(double net, double allowance) {
        return calculateBasicSalary(net, allowance) + allowance;
    }

    protected static double calculateBasicSalary(double net, double allowance) {
        return net / (1 - EmployeeTaxImpl.percentageOfTierTwoAndThree - Taxable.calculateTaxPayPercentage(net)) - allowance;
    }
}