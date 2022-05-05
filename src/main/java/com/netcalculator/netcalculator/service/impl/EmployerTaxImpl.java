package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.service.Accumulator;
import com.netcalculator.netcalculator.service.EmployerTax;
import org.springframework.stereotype.Service;

@Service
public class EmployerTaxImpl implements EmployerTax {
    private static final double percentageOfTierOneAndTierThree = 0.18;

    private Accumulator accumulator;

    @Override
    public double calculateEmployerPensionAmount(double net, double allowance) {
        return accumulator.calculateActualGross(net, allowance) * percentageOfTierOneAndTierThree;
    }

    @Override
    public double calculateTierOneAndTierThree(double net, double allowance) {
        return percentageOfTierOneAndTierThree * accumulator.calculateActualGross(net,allowance);
    }
}