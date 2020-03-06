package com.nsc.designprinciples.dependencyinversion.notifications;

import com.nsc.designprinciples.singleresponsibility.Employee;

public interface EmployeeNotifier {
    void notify(Employee employee);
}
