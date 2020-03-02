package com.nsc.designpattern.behavioral.command;

/**
 * command design pattern encapsulates request as an object.
 * Decoupling sender from processor. Helps in loose coupling instead of tight coupling.
 * Object per command, encapsulates a request as an object
 * Reduces coupling the invoker and receiver of a command.
 * <p>
 * command design pattern has following participants
 * 1. Command - is an interface
 * 2. ConcreteCommand - LightOnCommand, LightOfCommand etc..
 * 3. Receiver - Light class
 * 4. Invoker - Like a switch or remote control which actually receives commands and issues
 * <p>
 * Eg: java.lang.Runnable
 * <p>
 * We can combine light operation with other operations also, such as fan turn on/off, fan speed variation etc..
 */
public interface Command {
    void execute();
}
