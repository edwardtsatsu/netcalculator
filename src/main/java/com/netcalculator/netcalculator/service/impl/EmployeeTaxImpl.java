package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.service.EmployeeTax;
import org.springframework.stereotype.Service;

@Service
public class EmployeeTaxImpl extends EmployeeTax {
    public static final double percentageOfTierTwoAndThree = 0.105;
}