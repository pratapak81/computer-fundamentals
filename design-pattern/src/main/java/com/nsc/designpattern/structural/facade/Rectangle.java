package com.nsc.designpattern.structural.facade;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }

    @Override
    public void applyColor() {
        System.out.println("Rectangle::color()");
    }
}
