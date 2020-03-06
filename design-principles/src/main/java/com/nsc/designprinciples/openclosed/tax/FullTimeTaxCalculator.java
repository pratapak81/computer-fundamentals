package com.nsc.designprinciples.openclosed.tax;

import com.nsc.designprinciples.singleresponsibility.Employee;

public class FullTimeTaxCalculator implements TaxCalculator {
    @Override
    public double calculate(Employee employee) {
        System.out.println("calculating FTE tax");
        return 0;
    }
}
