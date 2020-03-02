package com.nsc.designpattern.structural.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        System.out.println("==============");

        shapeMaker.applyColorToCircle();
        shapeMaker.applyColorToRectangle();
        shapeMaker.applyColorToSquare();
    }
}
