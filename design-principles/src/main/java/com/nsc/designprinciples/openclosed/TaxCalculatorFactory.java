package com.nsc.designprinciples.openclosed;

import com.nsc.designprinciples.openclosed.tax.FullTimeTaxCalculator;
import com.nsc.designprinciples.openclosed.tax.InternTaxCalculator;
import com.nsc.designprinciples.openclosed.tax.PartTimeTaxCalculator;
import com.nsc.designprinciples.openclosed.tax.TaxCalculator;
import com.nsc.designprinciples.singleresponsibility.Employee;

public class TaxCalculatorFactory {
    public static TaxCalculator getInstance(Employee employee) {
        if (employee instanceof FullTimeEmployee) {
            return new FullTimeTaxCalculator();
        }
        if (employee instanceof PartTimeEmployee) {
            return new PartTimeTaxCalculator();
        }
        if (employee instanceof Intern) {
            return new InternTaxCalculator();
        }
        throw new RuntimeException("Invalid employee type");
    }
}
