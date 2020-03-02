package com.nsc.designpattern.structural.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }

    @Override
    public void applyColor() {
        System.out.println("Square::color()");
    }
}
