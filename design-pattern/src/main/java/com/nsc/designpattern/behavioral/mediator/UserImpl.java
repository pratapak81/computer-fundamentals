package com.nsc.designpattern.behavioral.mediator;

/**
 * ConcreteColleague's communicate only through the Mediator
 */
public class UserImpl extends User {

    public UserImpl(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    void sendMessage(String message) {
        System.out.println(this.name + " sent message");
        mediator.sendMessage(message, this);
    }

    @Override
    void receiveMessage(String message) {
        System.out.println(this.name + " received message");
    }
}
