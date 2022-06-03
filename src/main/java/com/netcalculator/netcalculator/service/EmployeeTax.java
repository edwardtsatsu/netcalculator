package com.netcalculator.netcalculator.service;

import org.springframework.stereotype.Service;

import static com.netcalculator.netcalculator.service.Accumulator.calculateGross;


@Service
public abstract class EmployeeTax {
    private static final double percentageOfTierTwoAndThree = 0.104;
    static double calculateEmployeePensionContributionAmount(double net, double allowance) {
        return calculateGross(net, allowance) * percentageOfTierTwoAndThree;
    }
}