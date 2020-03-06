package com.nsc.designprinciples.openclosed.tax;

import com.nsc.designprinciples.singleresponsibility.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
