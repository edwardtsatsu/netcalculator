package com.netcalculator.netcalculator.service;

import com.netcalculator.netcalculator.response.ClientResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxServiceMangerTest {

    private TaxServiceManger taxServiceManger;

    @BeforeEach
    void setUp() {
        taxServiceManger = new TaxServiceManger();
    }

    @Test
    void getRequiredDetails() {
        ClientResponse expectedClientResponse = ClientResponse.builder()
                                                              .grossSalary(3400.591194968553)
                                                              .totalTaxPayeTax(427.7473201218305)
                                                              .basicSalary(2550.591194968553)
                                                              .employeePensionContributionAmount(357.06207547169805)
                                                              .employerPensionAmount(612.1064150943395)
                                                              .build();
        ClientResponse actualRequiredDetails = taxServiceManger.getRequiredDetails(2703.47, 850);
        assertEquals(expectedClientResponse, actualRequiredDetails);
    }
}