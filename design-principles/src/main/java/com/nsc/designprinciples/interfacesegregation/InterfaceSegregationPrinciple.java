package com.nsc.designprinciples.interfacesegregation;

import com.nsc.designprinciples.interfacesegregation.payslip.Payslip;
import com.nsc.designprinciples.singleresponsibility.persistence.EmployeeFileSerializer;
import com.nsc.designprinciples.singleresponsibility.persistence.EmployeeRepository;

import java.time.Month;

/**
 * Clients should not be forced to depend on methods that they do not use. ISP reinforces other principles.
 * By keeping interfaces small, the class that implements them have a higher chance to fully substitute the interface. Hence follows LSP
 * Classes that implement small interfaces are more focused and tend to have a single purpose. Hence follows SRP
 * <p>
 * Benefits:
 * 1. Lean interfaces minimize dependencies on unused members and reduce code coupling
 * 2. Code becomes more cohesive and focused
 * 3. It reinforces the use of the SRP and LSP
 * <p>
 * Symptoms of Interface pollution:
 * 1. Interfaces with lots of methods
 * 2. Interfaces with low cohesion
 * 3. Client throws exception instead of implementing methods
 * 4. Client provides empty implementations
 * 5. Client forces implementation and becomes highly coupled
 * <p>
 * If you are using public framework and want to apply ISP, then best approach is to use Adapter design pattern.
 */
public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository employeeRepository = new EmployeeRepository(employeeFileSerializer);

        employeeRepository.findAll().forEach(employee -> {
            Payslip payslip = new Payslip(employee, Month.MARCH);
            String payslipText = payslip.toText();
            System.out.println(payslipText);
        });
    }
}
