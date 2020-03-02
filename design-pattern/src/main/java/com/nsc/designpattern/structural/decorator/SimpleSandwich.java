package com.nsc.designpattern.structural.decorator;

/**
 * Concrete Component - The basic implementation of the component interface
 */
public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "bread";
    }
}
