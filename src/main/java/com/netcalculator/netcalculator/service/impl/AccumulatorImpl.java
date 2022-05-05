package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.service.Accumulator;
import com.netcalculator.netcalculator.service.Taxable;
import org.springframework.stereotype.Service;

@Service
public class AccumulatorImpl implements Accumulator {
    private static final double percentageOfTierOneAndTierThree = 0.105;

    private Taxable taxable;

    @Override
    public double calculateBasicSalary(double net, double allowance) {
        return net / (1 - percentageOfTierOneAndTierThree - taxable.calculateTaxPayPercentage(net) - allowance);
    }

    @Override
    public double calculateActualGross(double net, double allowance) {
        return allowance + calculateBasicSalary(net, allowance);
    }
}