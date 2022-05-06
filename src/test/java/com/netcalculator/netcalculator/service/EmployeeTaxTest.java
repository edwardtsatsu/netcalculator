package com.netcalculator.netcalculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTaxTest {

    @Test
    void calculateEmployeePensionContributionAmount() {
        double actual = EmployeeTax.calculateEmployeePensionContributionAmount(2703.47, 850.00);
        assertEquals(357.06207547169805, actual);
    }
}