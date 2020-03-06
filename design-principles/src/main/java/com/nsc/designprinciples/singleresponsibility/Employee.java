package com.nsc.designprinciples.singleresponsibility;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private double monthlyIncome;
    private double nbHoursPerWeek;

    public Employee(String firstName, String lastName, double monthlyIncome, double nbHoursPerWeek) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlyIncome = monthlyIncome;
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public double getNbHoursPerWeek() {
        return nbHoursPerWeek;
    }

    public void setNbHoursPerWeek(double nbHoursPerWeek) {
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public abstract void requestTimeOff(int days, Employee manager);
}
