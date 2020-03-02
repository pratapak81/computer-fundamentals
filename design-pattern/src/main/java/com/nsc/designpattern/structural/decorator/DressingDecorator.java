package com.nsc.designpattern.structural.decorator;

/**
 * Concrete Decorator - Extending the base decorator functionality and modifying the component behavior accordingly
 */
public class DressingDecorator extends SandwichDecorator {
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + Mustard";
    }
}
