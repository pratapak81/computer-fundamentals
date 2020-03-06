package com.nsc.designprinciples.openclosed;

import com.nsc.designprinciples.openclosed.tax.TaxCalculator;
import com.nsc.designprinciples.singleresponsibility.Employee;

/**
 * Classes, functions, and modules should be closed for modification, but open for extension
 * <p>
 * Closed for modification: each new feature should not modify existing source code
 * Open for extension: A component should be extendable to make it behave in new ways
 * <p>
 * Advantages:
 * 1. New feature can be added easily and with minimal cost
 * 2. Minimizes the risk of regression bugs
 * 3. Enforces decoupling by isolating changes in specific components, works along with the SRP
 * <p>
 * NOTE:
 * 1. Best way to apply OCP is to use inheritance or use Strategy design pattern. Please remember inheritance introduces coupling.
 * 2. Don't apply OCP for bug fixes
 * <p>
 * Best practices for Changing APIs
 * 1. Do not change existing public contracts: data classes, signatures
 * 2. Expose abstractions to your customers and let them add new features on top of your framework
 * 3. If a breaking change is inevitable, give your clients time to adapt
 */
public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Employee fte = new FullTimeEmployee("Pratap", "AK", 2000, 40);
        Employee pte = new PartTimeEmployee("Mahesh", "NK", 1000, 60);
        Employee intern = new Intern("Suresh", "BK", 800, 35);

        TaxCalculator taxCalculator = TaxCalculatorFactory.getInstance(fte);
        taxCalculator.calculate(fte);

        taxCalculator = TaxCalculatorFactory.getInstance(pte);
        taxCalculator.calculate(pte);

        taxCalculator = TaxCalculatorFactory.getInstance(intern);
        taxCalculator.calculate(intern);

        Employee juniorIntern = new Intern("Style", "King", 250, 20);
        taxCalculator.calculate(juniorIntern);

    }
}
