package com.nsc.designpattern.structural.facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }

    @Override
    public void applyColor() {
        System.out.println("Circle::color()");
    }
}
