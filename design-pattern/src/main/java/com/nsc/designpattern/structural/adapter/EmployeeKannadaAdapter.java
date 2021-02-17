package com.nsc.designpattern.structural.adapter;

public class EmployeeKannadaAdapter implements Employee {

    private final EmployeeKannada employeeKannada;

    public EmployeeKannadaAdapter(EmployeeKannada employeeKannada) {
        this.employeeKannada = employeeKannada;
    }

    @Override
    public String getId() {
        return employeeKannada.getEkamaatra();
    }

    @Override
    public String getFirstName() {
        return employeeKannada.getModalaneHesaru();
    }

    @Override
    public String getLastName() {
        return employeeKannada.getKoneyaHesaru();
    }

    @Override
    public String getEmail() {
        return employeeKannada.getTapalu();
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
