package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.service.Accumulator;
import com.netcalculator.netcalculator.service.EmployerTax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerTaxImpl implements EmployerTax {
    private static final double percentageOfTierOneAndTierThree = 0.18;

    @Autowired
    private Accumulator accumulator;

    @Override
    public double calculateEmployerPensionAmount(double allowance) {
        return accumulator.calculateGross(allowance) * percentageOfTierOneAndTierThree;
    }

    @Override
    public double calculateTierOneAndTierThree(double allowance) {
        return percentageOfTierOneAndTierThree * accumulator.calculateGross(allowance);
    }
}