package com.nsc.designprinciples.dependencyinversion.notifications;

import com.nsc.designprinciples.singleresponsibility.Employee;

public class EmailSender implements EmployeeNotifier {
    @Override
    public void notify(Employee employee) {
        System.out.println("notified employee through email");
    }
}
