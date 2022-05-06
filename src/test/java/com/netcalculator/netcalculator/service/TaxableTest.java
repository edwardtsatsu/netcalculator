package com.netcalculator.netcalculator.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxableTest {
    @Mock
    private Accumulator accumulator;

    @Test
    void shouldCalculateTotalPayETaxTest() {
        double actual = Taxable.calculateTotalPayETax(2703.47, 850.00);
        assertEquals(427.7473201218305, actual);
    }

    @Test
    void shouldCalculateTaxPayPercentageTest() {
        double actual = Taxable.calculateTaxPayPercentage(2703.47);
        assertEquals(0.1,actual);
    }
}