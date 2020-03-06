package com.nsc.designprinciples.openclosed;

import com.nsc.designprinciples.singleresponsibility.Employee;

public class Intern extends Employee {
    public Intern(String firstName, String lastName, double monthlyIncome, double nbHoursPerWeek) {
        super(firstName, lastName, monthlyIncome, nbHoursPerWeek);
    }
}
