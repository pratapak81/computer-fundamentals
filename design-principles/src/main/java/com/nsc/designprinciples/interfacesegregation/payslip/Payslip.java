package com.nsc.designprinciples.interfacesegregation.payslip;

import com.nsc.designprinciples.singleresponsibility.Employee;

import java.time.Month;

public class Payslip implements ExportableText {

    private Employee employee;
    private Month month;

    public Payslip(Employee employee, Month month) {
        this.employee = employee;
        this.month = month;
    }

    @Override
    public String toText() {
        return "payslip for " + this.month.name();
    }
}
