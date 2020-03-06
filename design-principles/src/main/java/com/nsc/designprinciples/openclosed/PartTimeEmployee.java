package com.nsc.designprinciples.openclosed;

import com.nsc.designprinciples.singleresponsibility.Employee;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String firstName, String lastName, double monthlyIncome, double nbHoursPerWeek) {
        super(firstName, lastName, monthlyIncome, nbHoursPerWeek);
    }

    @Override
    public void requestTimeOff(int days, Employee manager) {
        System.out.println(days + " days leave granted");
    }
}
