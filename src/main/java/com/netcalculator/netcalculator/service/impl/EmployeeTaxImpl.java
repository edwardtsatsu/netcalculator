package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.service.Accumulator;
import com.netcalculator.netcalculator.service.EmployeeTax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeTaxImpl implements EmployeeTax {
    private static final double percentageOfTierTwoAndThree = 0.18;

    @Autowired
    private Accumulator accumulator;

    @Override
    public double calculateEmployeePensionContributionAmount(double allowance) {
        return accumulator.calculateGross(allowance) * calculateTierTwoAndTierThree(allowance);
    }


    @Override
    public double calculateTierTwoAndTierThree(double allowance) {
        return percentageOfTierTwoAndThree * accumulator.calculateGross(allowance);
    }
}