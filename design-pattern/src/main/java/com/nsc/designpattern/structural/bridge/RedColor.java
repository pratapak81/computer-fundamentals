package com.nsc.designpattern.structural.bridge;

/**
 * Concrete Implementation – Implements the implementer by providing concrete implementation
 */
public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Red Color");
    }
}
