package com.netcalculator.netcalculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxableTest {

    @Test
    void shouldCalculateTaxPayPercentageTest() {
        double actual = Taxable.calculateTaxPayPercentage(2703.47);
        assertEquals(0.1, actual);
    }

    @Test
    void shouldCalculateTotalPayETaxTest() {
        double actual = Taxable.calculateTotalPayETax(2703.47, 850.00);
        assertEquals(340.0591194968553, actual);
    }
}