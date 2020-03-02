package com.nsc.designpattern.behavioral.memento;

import java.util.Stack;

/**
 * caretaker : the object that keeps track of multiple memento. Like maintaining save points.
 */
public class CareTaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee employee) {
        employeeHistory.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }
}
