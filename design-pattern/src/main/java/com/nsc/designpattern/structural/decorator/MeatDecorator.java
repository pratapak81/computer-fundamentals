package com.nsc.designpattern.structural.decorator;

/**
 * Concrete Decorator - Extending the base decorator functionality and modifying the component behavior accordingly
 */
// this is our inheritance
public class MeatDecorator extends SandwichDecorator {
    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + Chicken";
    }
}
