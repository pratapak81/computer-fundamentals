package com.nsc.designpattern.structural.bridge;

/**
 * Refined Abstraction. Extends the abstraction takes the finer detail one level below.
 * Hides the finer elements from implemetors
 */
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
