package com.nsc.designpattern.structural.composite;

/**
 * Client – Client manipulates the objects in the composition through the component interface
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Dev1");
        Employee developer2 = new Developer("Dev2");

        CompanyDirectory developerDirectory = new CompanyDirectory();
        developerDirectory.addEmployee(developer1);
        developerDirectory.addEmployee(developer2);

        Employee manager1 = new Manager("Manager1");
        Employee manager2 = new Manager("Manager2");

        CompanyDirectory managerDirectory = new CompanyDirectory();
        managerDirectory.addEmployee(manager1);
        managerDirectory.addEmployee(manager2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(developerDirectory);
        companyDirectory.addEmployee(managerDirectory);
        companyDirectory.showEmployeeDetails();
    }
}
