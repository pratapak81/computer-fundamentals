package com.nsc.designpattern.behavioral.mediator;

/**
 * Mediator defines the interface the Colleague objects use to communicate.
 * Colleague objects do not refer to each other directly. Instead, all the communication is carried out by the Mediator.
 * <p>
 * Mediator design pattern is used to define how objects interacts with one another without referring to each other
 * Helps is loose coupling between objects
 * <p>
 * Mediator design pattern has following participants
 * 1. Mediator - is an interface
 * 2. ConcreteMediator - will have list of Colleague
 * 3. Colleague -  which will be having reference to Mediator. This is an abstract class
 * 4. ConcreteColleague - communicates only through mediator
 * 5. Client
 * <p>
 * NOTE: Objects which interact with one another are called Colleague's
 * <p>
 * Eg: Air Traffic controller act as a mediator between airplanes
 */
public interface Mediator {
    void sendMessage(String message, User user);

    void addUser(User user);
}
