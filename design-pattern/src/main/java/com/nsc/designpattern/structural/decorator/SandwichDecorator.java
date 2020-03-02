package com.nsc.designpattern.structural.decorator;

/**
 * Decorator pattern is an hierarchical type pattern that builds functionality at each level by using composition
 * Decorator design pattern is used to modify the functionality of an object at runtime.
 * At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior
 * Decorator - Decorator class implements the component interface and it has a HAS-A relationship with the component interface
 * Decorator pattern uses composition and inheritance
 * Both Component and Decorator should implement same interface or extend same super class
 * <p>
 * Decorator pattern has four participants
 * 1. Component
 * 2. Concrete Component
 * 3. Decorator
 * 4. Concrete Decorator - we can have many concrete decorators
 * <p>
 * Also called as a wrapper. Add behaviour without affecting others. Follows single responsibility principle.
 * Eg: Java.io.InputStream, java.util.Collections#checkedList, UI components
 */
public abstract class SandwichDecorator implements Sandwich {

    // this is our composition
    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }
}
