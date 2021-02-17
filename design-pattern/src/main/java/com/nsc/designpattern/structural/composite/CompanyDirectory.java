package com.nsc.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * The intent of a composite is to “compose” objects into tree structures to represent part-whole hierarchies
 * Composite – Composite stores child components and implements child related operations in the component interface.
 * Composite knows about child component and it has all the functionality of child components
 * The Composite Pattern has four participants
 * 1. component - interface/abstract class
 * 2. leaf
 * 3. composite
 * 4. client
 * <p>
 * Note: Composite pattern deals with tree structures of information
 * Eg: Java AWT, JSF widgets, Restful service Gets, Map putAll method
 */
public class CompanyDirectory implements Employee {

    private final List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        employeeList.forEach(Employee::showEmployeeDetails);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
