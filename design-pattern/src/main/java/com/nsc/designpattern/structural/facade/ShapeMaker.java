package com.nsc.designpattern.structural.facade;

/**
 * The facade pattern is appropriate when we have a complex system that we want to expose to clients in a simplified way.
 * Its purpose is to hide internal complexity behind a single interface that appears simple from the outside
 * <p>
 * Remember facade does not reduce the complexity. It only hides it from external systems and clients. So the primary beneficiary
 * of facade patterns are client applications and other systems only
 * <p>
 * This pattern involves a single class which provides simplified methods required by client and
 * delegates calls to methods of existing system classes
 * Eg: JDBC interface, Hotel Search etc...
 * <p>
 * Facade pattern will not use inheritance
 * <p>
 * So, As the name suggests, it means the face of the building.
 * The people walking past the road can only see this glass face of the building.
 * They do not know anything about it, the wiring, the pipes and other complexities.
 * It hides all the complexities of the building and displays a friendly face
 */
public class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void applyColorToCircle() {
        circle.applyColor();
    }

    public void applyColorToRectangle() {
        rectangle.applyColor();
    }

    public void applyColorToSquare() {
        square.applyColor();
    }
}
