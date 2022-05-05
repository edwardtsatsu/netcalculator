package com.netcalculator.netcalculator.response;

import lombok.Data;

@Data
public class ClientResponse {
    private double grossSalary;
    private double basicSalary;
    private double totalTaxPayeTax;
    private double employeePensionContributionAmount;
    private double employerPensionAmount;
}