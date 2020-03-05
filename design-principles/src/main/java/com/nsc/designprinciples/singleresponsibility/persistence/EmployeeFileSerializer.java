package com.nsc.designprinciples.singleresponsibility.persistence;

import com.nsc.designprinciples.singleresponsibility.Employee;

// SRP - class only worried about serialization
public class EmployeeFileSerializer {

    public String serialize(Employee employee) {
        StringBuilder sb = new StringBuilder();
        sb.append("### EMPLOYEE RECORD ####");
        sb.append(System.lineSeparator());
        sb.append("NAME: ");
        sb.append(employee.getFirstName());
        sb.append(" ");
        sb.append(employee.getLastName());
        sb.append(System.lineSeparator());
        sb.append("POSITION: ");
        sb.append(employee.getClass().getTypeName());
        sb.append(System.lineSeparator());
        sb.append("EMAIL: ");
        sb.append(employee.getEmail());
        sb.append(System.lineSeparator());
        sb.append("MONTHLY WAGE: ");
        sb.append(employee.getMonthlyIncome());
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
