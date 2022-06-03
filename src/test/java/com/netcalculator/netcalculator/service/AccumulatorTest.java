package com.netcalculator.netcalculator.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AccumulatorTest {

    @Test
    void shouldCalculateGrossTest() {
        double actual = Accumulator.calculateGross(2703.47, 850.00);
        assertEquals(3400.591194968553, actual);
    }

    @Test
    void shouldCalculateBasicSalaryTest() {
        double actual = Accumulator.calculateBasicSalary(2703.47, 850);
        assertEquals(2550.591194968553, actual);
    }
}