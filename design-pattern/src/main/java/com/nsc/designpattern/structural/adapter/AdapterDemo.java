package com.nsc.designpattern.structural.adapter;

/**
 * The client sees only the target interface and not the adapter. The adapter implements the target interface.
 * Adapter delegates all requests to Adaptee.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient employeeClient = new EmployeeClient();
        System.out.println(employeeClient.getEmployeeList());
    }
}
