package com.nsc.designprinciples.dependencyinversion;

import com.nsc.designprinciples.singleresponsibility.Employee;

import java.util.List;

public interface EmployeeRepo {
    List<Employee> findAll();
}
