package com.nsc.designpattern.structural.bridge;

/**
 * The bridge pattern allows the Abstraction and the Implementation to be developed independently and
 * the client code can access only the Abstraction part without being concerned about the Implementation part.
 * <p>
 * The abstraction is an interface or abstract class and the implementor is also an interface or abstract class.
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Color redColor = new RedColor();
        Color blueColor = new BlueColor();

        Shape redCircle = new Circle(redColor);
        Shape blueCircle = new Circle(blueColor);

        Shape redSquare = new Square(redColor);
        Shape blueSquare = new Square(blueColor);

        redCircle.applyColor();
        blueCircle.applyColor();

        redSquare.applyColor();
        blueSquare.applyColor();
    }
}
