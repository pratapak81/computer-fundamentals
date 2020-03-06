package com.nsc.designprinciples.dependencyinversion.payment;

import com.nsc.designprinciples.dependencyinversion.EmployeeRepo;
import com.nsc.designprinciples.dependencyinversion.notifications.EmployeeNotifier;
import com.nsc.designprinciples.singleresponsibility.Employee;

import java.util.List;

public class PaymentProcessor {

    private EmployeeRepo employeeRepo;
    private EmployeeNotifier employeeNotifier;

    // Dependency Injection
    public PaymentProcessor(EmployeeRepo employeeRepo, EmployeeNotifier employeeNotifier) {
        this.employeeRepo = employeeRepo;
        this.employeeNotifier = employeeNotifier;
    }

    public double sendPayments() {
        List<Employee> employeeList = employeeRepo.findAll();
        double totalPayments = 0;

        for (Employee employee : employeeList) {
            totalPayments += employee.getMonthlyIncome();
            this.employeeNotifier.notify(employee);
        }
        return totalPayments;
    }
}
