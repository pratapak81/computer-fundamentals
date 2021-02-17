package com.nsc.designpattern.structural.adapter;

/**
 * Connecting new code to legacy code without changing working contract
 * Convert interface into another interface
 * Translate requests and responses
 * Client, Adapter, Adaptee
 * The client sees only the target interface and not the adapter. The adapter implements the target interface.
 * Adapter delegates all requests to Adaptee.
 * Eg: Arrays -> Lists (Arrays.asList(....))
 */
public class EmployeeLDAPAdapter implements Employee {

    private final EmployeeLDAP employeeLDAP;

    public EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP) {
        this.employeeLDAP = employeeLDAP;
    }

    @Override
    public String getId() {
        return employeeLDAP.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLDAP.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLDAP.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLDAP.getMail();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id='" + getId() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
