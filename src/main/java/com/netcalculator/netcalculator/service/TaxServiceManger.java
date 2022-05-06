package com.netcalculator.netcalculator.service;

import com.netcalculator.netcalculator.response.ClientResponse;
import org.springframework.stereotype.Service;

@Service
public class TaxServiceManger {

    public ClientResponse getRequiredDetails(double net, double allowance) {
        return ClientResponse.builder()
                             .grossSalary(Accumulator.calculateGross(net, allowance))
                             .basicSalary(Accumulator.calculateBasicSalary(net, allowance))
                             .totalTaxPayeTax(Taxable.calculateTotalPayETax(Accumulator.calculateGross(net, allowance), allowance))
                             .employeePensionContributionAmount(EmployeeTax.calculateEmployeePensionContributionAmount(net, allowance))
                             .employerPensionAmount(EmployerTax.calculateEmployerPensionAmount(net, allowance))
                             .build();
    }
}