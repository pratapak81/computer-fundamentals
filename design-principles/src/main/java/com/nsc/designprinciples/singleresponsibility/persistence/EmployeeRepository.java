package com.nsc.designprinciples.singleresponsibility.persistence;

import com.nsc.designprinciples.openclosed.FullTimeEmployee;
import com.nsc.designprinciples.openclosed.PartTimeEmployee;
import com.nsc.designprinciples.singleresponsibility.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

// SRP - only worried about employee related operations
public class EmployeeRepository {

    private EmployeeFileSerializer employeeFileSerializer;

    public EmployeeRepository(EmployeeFileSerializer employeeFileSerializer) {
        this.employeeFileSerializer = employeeFileSerializer;
    }

    public List<Employee> findAll() {
        Employee pratap = new FullTimeEmployee("Pratap", "AK", 2000, 12);
        Employee mahesh = new PartTimeEmployee("Mahesh", "NK", 1000, 15);
        return Arrays.asList(pratap, mahesh);
    }

    public void save(Employee employee) throws IOException {

        String serializedString = employeeFileSerializer.serialize(employee);

        Path path = Paths.get(employee.getFirstName()
                .replace(" ", "_") + ".rec");
        Files.write(path, serializedString.getBytes());
    }
}
