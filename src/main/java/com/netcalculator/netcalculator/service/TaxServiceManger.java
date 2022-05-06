package com.netcalculator.netcalculator.service;

import com.netcalculator.netcalculator.response.ClientResponse;
import com.netcalculator.netcalculator.service.impl.AccumulatorImpl;
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
        double deductions = net - accumulator.calculateGross(allowance);
        System.out.println(deductions);
        return ClientResponse.builder()
                             .grossSalary(accumulator.calculateGross(allowance))
                             .basicSalary(AccumulatorImpl.calculateBasicSalary())
                             .totalTaxPayeTax(taxable.calculateTotalPayETax(accumulator.calculateGross(allowance), allowance))
                             .employeePensionContributionAmount(employeeTax.calculateEmployeePensionContributionAmount(allowance))
                             .employerPensionAmount(employerTax.calculateEmployerPensionAmount(allowance))
                             .build();
    }
}