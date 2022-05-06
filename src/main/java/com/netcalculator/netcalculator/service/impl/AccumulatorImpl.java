package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.service.Accumulator;
import org.springframework.stereotype.Service;

@Service
public class AccumulatorImpl implements Accumulator {
    private static final double basicSalary = 1800.00;

    public static double calculateBasicSalary() {
        return AccumulatorImpl.basicSalary;
    }

    @Override
    public double calculateGross(double allowance) {
        return AccumulatorImpl.basicSalary + allowance;
    }
}