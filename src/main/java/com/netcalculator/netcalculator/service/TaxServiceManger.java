package com.netcalculator.netcalculator.service;

import com.netcalculator.netcalculator.response.ClientResponse;
import org.springframework.stereotype.Service;

@Service
public class TaxServiceManger {
    private final Accumulator accumulator;
    private final EmployeeTax employeeTax;
    private final EmployerTax employerTax;
    private final Taxable taxable;

    public TaxServiceManger(Accumulator accumulator, EmployeeTax employeeTax, EmployerTax employerTax, Taxable taxable) {
        this.accumulator = accumulator;
        this.employeeTax = employeeTax;
        this.employerTax = employerTax;
        this.taxable = taxable;
    }

    public ClientResponse getRequiredDetails(double net, double allowance) {
        return ClientResponse.builder()
                             .grossSalary(accumulator.calculateActualGross(net, allowance))
                             .basicSalary(accumulator.calculateBasicSalary(net, allowance))
                             .totalTaxPayeTax(taxable.calculateTotalPayETax(net, net, allowance))
                             .employeePensionContributionAmount(employeeTax.calculateEmployeePensionContributionAmount(net, allowance))
                             .employerPensionAmount(employerTax.calculateEmployerPensionAmount(net, allowance))
                             .build();
    }
}
