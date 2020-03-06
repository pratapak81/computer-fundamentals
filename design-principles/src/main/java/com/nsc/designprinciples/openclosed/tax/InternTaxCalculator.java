package com.nsc.designprinciples.openclosed.tax;

import com.nsc.designprinciples.singleresponsibility.Employee;

public class InternTaxCalculator implements TaxCalculator {
    @Override
    public double calculate(Employee employee) {
        if (employee.getMonthlyIncome() > 350) {
            System.out.println("intern income greater than 350. calculating Intern tax");
            return 10;
        }
        System.out.println("intern income less than 350, no tax applicable");
        return 0;
    }
}
