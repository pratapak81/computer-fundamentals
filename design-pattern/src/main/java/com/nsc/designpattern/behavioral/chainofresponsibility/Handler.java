package com.nsc.designpattern.behavioral.chainofresponsibility;

/**
 * handler - it can be an interface or abstract class
 * Used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them.
 * When you want to decouple a request’s sender and receiver, then use this pattern
 * Handler is determined at runtime
 * <p>
 * This design pattern has following participants
 * 1. Handler - interface or abstract class
 * 2. Concrete handlers
 * 3. Client
 * <p>
 * Handler can be an interface which will primarily receive the request and dispatches the request to chain of handlers.
 * It has reference of only first handler in the chain and does not know anything about rest of the handlers
 * <p>
 * Eg: java Logger
 */
public interface Handler {
    void setNextHandler(Handler handler);

    void process(Number number);
}
