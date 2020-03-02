package com.nsc.designpattern.behavioral.strategy;

/**
 * Strategy design pattern is used where we choose a specific implementation of algorithm or task in run time
 * In general, when we have multiple implementation of same interface
 * <p>
 * Strategy design pattern has following participants
 * 1. Strategy
 * 2. ConcreteStrategy
 * 3. Context
 * 4. Client
 * <p>
 * Eg:
 * java.util.Comparator
 */
public interface CreditCardValidationStrategy {
    boolean validate(CreditCard creditCard);
}
