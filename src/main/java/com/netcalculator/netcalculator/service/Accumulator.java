package com.netcalculator.netcalculator.service;

import com.netcalculator.netcalculator.exception.BasicSalaryCanNotBeZeroException;
import org.springframework.stereotype.Service;

@Service
public abstract class Accumulator {
    private static final double percentageOfTierTwoAndThree = 0.015;

    static double calculateGross(double net, double allowance) {
        return calculateBasicSalary(net, allowance) + allowance;
    }

    protected static double calculateBasicSalary(double net, double allowance) {
        double basicSalary = net / (1 - percentageOfTierTwoAndThree - Taxable.calculateTaxPayPercentage(net)) - allowance;
        if (basicSalary < 0) {
            throw new BasicSalaryCanNotBeZeroException("basic salary can not be less than zero");
        } else {
            return basicSalary;
        }
    }
}