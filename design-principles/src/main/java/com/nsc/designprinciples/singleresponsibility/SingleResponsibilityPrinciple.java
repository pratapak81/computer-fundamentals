package com.nsc.designprinciples.singleresponsibility;

import com.nsc.designprinciples.singleresponsibility.logging.ConsoleLogger;
import com.nsc.designprinciples.singleresponsibility.persistence.EmployeeFileSerializer;
import com.nsc.designprinciples.singleresponsibility.persistence.EmployeeRepository;

import java.io.IOException;
import java.util.List;

/**
 * Every function, class or module should have one and only one reason to change.
 * <p>
 * Responsibilities Eg:
 * Business logic, User Interface, Persistence, Logging etc..
 * <p>
 * Advantages:
 * 1. It makes code easier to understand, fix and maintain
 * 2. CLasses are less coupled and more resilient to change
 * 3. More testable design
 * <p>
 * Violations:
 * If-else, Switch, Large Methods etc..
 * <p>
 * Not using SRP:
 * 1. Code is more difficult to read and reason about
 * 2. Decreased quality due to testing difficulty
 * 3. Side effects
 * 4. High Coupling - level of inter-dependency between various software components
 * <p>
 * Note: If Module A knows too much about Module B, changes to the internals of Module B may break functionality in
 * Module A
 * <p>
 * SRP - caller class/client
 */
public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository employeeRepository = new EmployeeRepository(employeeFileSerializer);
        ConsoleLogger consoleLogger = new ConsoleLogger();

        List<Employee> employeeList = employeeRepository.findAll();

        employeeList.forEach(employee -> {
            try {
                employeeRepository.save(employee);
                consoleLogger.writeInfo("Employee saved " + employee.toString());
            } catch (IOException e) {
                consoleLogger.writeError("Error saving employee ", e);
            }
        });
    }
}
