package com.nsc.designpattern.structural.bridge;

/**
 * Bridge design pattern allows you to separate the abstraction from the implementation.
 * Shape is an Abstraction and it contains a reference to the implementer
 * It uses Encapsulation, Composition and Inheritance.
 * Bridge uses Interfaces and Abstract classes. It prefers Composition over Inheritance.
 * Changes to the implementor do not affect client code
 * Eg: Drivers, JDBC
 */
public abstract class Shape {

    protected Color color;

    // this is our composition
    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
