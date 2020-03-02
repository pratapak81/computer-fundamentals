package com.nsc.designpattern.behavioral.templatemethod;

/**
 * Template method design pattern is to define an algorithm as skeleton of operations
 * and leave the details to be implemented by the child classes.
 * The overall structure and sequence of the algorithm is preserved by the parent class
 * Template method defines the steps to execute an algorithm
 * <p>
 * Template method design pattern has following participants
 * 1. Abstract class - class contains template method
 * 2. Concrete class
 * <p>
 * Eg: Playing game steps, Order Management System steps, House Building steps
 * <p>
 * Note: This pattern can be used while defining steps
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    // template method
    // don't care about the implementation but care about the steps
    // first we should initialize then play and at last end the game
    public final void playGame() {
        initialize();
        startPlay();
        endPlay();
    }
}
