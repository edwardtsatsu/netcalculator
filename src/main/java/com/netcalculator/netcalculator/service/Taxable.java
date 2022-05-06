package com.netcalculator.netcalculator.service;

import com.netcalculator.netcalculator.exception.GrossCanNotBeLessThanOneException;

import static com.netcalculator.netcalculator.service.Accumulator.calculateGross;

public abstract class Taxable {
    static double calculateTotalPayETax(double net, double allowance) {
        return calculateTaxPayPercentage(net) * calculateGross(net, allowance);
    }

    public static double calculateTaxPayPercentage(double gross) {
        //assuming netPay and gross pay fall within the same rage of tax payment percentage
        double result;
        if (gross < 1) {
            throw new GrossCanNotBeLessThanOneException("gross should not be less than one!");
        }
        int percentage = 100;
        if (gross < 419.00) {
            result = 0.00;
        } else if (gross > 419.00 && gross < 539.00) {
            result = 5.00;
        } else if (gross > 539.00 && gross < 3_539.00) {
            result = 10.00;
        } else if (gross > 3539.00 && gross < 20_000) {
            result = 17.50;
        } else {
            result = 20.00;
        }
        return result / percentage;
    }
}