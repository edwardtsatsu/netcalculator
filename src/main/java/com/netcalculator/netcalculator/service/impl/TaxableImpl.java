package com.netcalculator.netcalculator.service.impl;

import com.netcalculator.netcalculator.exception.GrossCanNotBeLessThanOneException;
import com.netcalculator.netcalculator.service.Accumulator;
import com.netcalculator.netcalculator.service.Taxable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxableImpl implements Taxable {

    @Autowired
    private Accumulator accumulator;

    @Override
    public double calculateTotalPayETax(double gross, double allowance) {
        return calculateTaxPayPercentage(gross) * accumulator.calculateGross(allowance);
    }

    @Override
    public double calculateTaxPayPercentage(double gross) {
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