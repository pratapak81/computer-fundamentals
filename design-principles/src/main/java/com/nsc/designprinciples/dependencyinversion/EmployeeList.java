package com.nsc.designprinciples.dependencyinversion;

import com.nsc.designprinciples.singleresponsibility.Employee;

import java.util.Collections;
import java.util.List;

public class EmployeeList implements EmployeeRepo {
    @Override
    public List<Employee> findAll() {
        return Collections.emptyList();
    }
}
