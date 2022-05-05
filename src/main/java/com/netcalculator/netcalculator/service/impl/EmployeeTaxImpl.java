package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.service.Accumulator;
import com.netcalculator.netcalculator.service.EmployeeTax;
import org.springframework.stereotype.Service;

@Service
public class EmployeeTaxImpl implements EmployeeTax {
    private static final double percentageOfTierTwoAndThree = 0.18;

    private Accumulator accumulator;

    @Override
    public double calculateEmployeePensionContributionAmount(double net, double allowance) {
        return accumulator.calculateActualGross(net, allowance) * calculateTierTwoAndTierThree(net, allowance);
    }

    @Override
    public double calculateTierTwoAndTierThree(double net, double allowance) {
        return percentageOfTierTwoAndThree * accumulator.calculateActualGross(net, allowance);
    }
}