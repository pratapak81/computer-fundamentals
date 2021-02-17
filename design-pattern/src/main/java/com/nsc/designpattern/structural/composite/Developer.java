package com.nsc.designpattern.structural.composite;

/**
 * Leaf – Leaf defines behavior for primitive objects in the composition. It represents leaf objects in the composition.
 * leaf means it has no objects below it.
 */
public class Developer implements Employee {

    private final String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer - " + name);
    }
}
