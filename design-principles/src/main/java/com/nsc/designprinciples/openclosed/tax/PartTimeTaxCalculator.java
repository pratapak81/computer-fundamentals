package com.nsc.designprinciples.openclosed.tax;

import com.nsc.designprinciples.singleresponsibility.Employee;

public class PartTimeTaxCalculator implements TaxCalculator {
    @Override
    public double calculate(Employee employee) {
        System.out.println("calculating PTE tax");
        return 0;
    }
}
