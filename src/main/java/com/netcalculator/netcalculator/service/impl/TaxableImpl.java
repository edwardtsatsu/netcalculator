package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.service.Accumulator;
import com.netcalculator.netcalculator.service.Taxable;
import org.springframework.stereotype.Service;

@Service
public class TaxableImpl implements Taxable {

    private Accumulator accumulator;

    @Override
    public double calculateTotalPayETax(double assumedGross, double net, double allowance) {
        return calculateTaxPayPercentage(assumedGross) * accumulator.calculateActualGross(net, allowance);
    }

    @Override
    public double calculateTaxPayPercentage(double assumedGross) {
        //assuming netPay and gross pay fall within the same rage of tax payment percentage
        double result;
        int percentage = 100;
        if (assumedGross < 419.00) {
            result = 0.00;
        } else if (assumedGross > 419.00 && assumedGross < 539.00) {
            result = 5.00;
        } else if (assumedGross > 539.00 && assumedGross < 3_539.00) {
            result = 10.00;
        } else if (assumedGross > 3539.00 && assumedGross < 20_000) {
            result = 17.50;
        } else {
            result = 20.00;
        }
        return result / percentage;
    }
}