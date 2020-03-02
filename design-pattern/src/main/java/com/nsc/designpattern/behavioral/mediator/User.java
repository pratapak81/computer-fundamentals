package com.nsc.designpattern.behavioral.mediator;

/**
 * Colleague defines the abstract class holding a single reference to the Mediator
 */
public abstract class User {

    protected String name;
    protected Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    abstract void sendMessage(String message);

    abstract void receiveMessage(String message);
}
