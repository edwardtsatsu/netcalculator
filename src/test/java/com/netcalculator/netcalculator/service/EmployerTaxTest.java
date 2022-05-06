package com.netcalculator.netcalculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployerTaxTest {

    @Test
    void calculateEmployerPensionAmount() {
        double actual = EmployerTax.calculateEmployerPensionAmount(2703.47, 850.00);
        assertEquals(612.1064150943395,actual);
    }
}