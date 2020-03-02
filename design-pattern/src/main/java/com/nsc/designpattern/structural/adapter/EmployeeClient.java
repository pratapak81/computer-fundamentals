package com.nsc.designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    List<Employee> employeeList = new ArrayList<>();

    public EmployeeClient() {
        this.addEmployeeFromDB();
        this.addEmployeeFromLDAP();
        this.addEmployeeKannada();
    }

    private void addEmployeeFromDB() {
        EmployeeDB employeeDB = new EmployeeDB("ID1", "Pratap", "A.K", "p@gmail.com");
        employeeList.add(employeeDB);
    }

    private void addEmployeeFromLDAP() {
        EmployeeLDAP employeeLDAP = new EmployeeLDAP("ID2", "A.K", "Pratap", "ak@gmail.com");
        EmployeeLDAPAdapter employeeLDAPAdapter = new EmployeeLDAPAdapter(employeeLDAP);
        employeeList.add(employeeLDAPAdapter);
    }

    private void addEmployeeKannada() {
        EmployeeKannada employeeKannada =
                new EmployeeKannada("ID3", "Mahesh", "Gowda", "m@gmail.com");
        EmployeeKannadaAdapter employeeKannadaAdapter = new EmployeeKannadaAdapter(employeeKannada);
        employeeList.add(employeeKannadaAdapter);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
