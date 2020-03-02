package com.nsc.designpattern.structural.bridge;

public class BlueColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Blue Color");
    }
}
