package com.nsc.designpattern.behavioral.strategy;

/**
 * concrete strategy
 */
public class HDFCStrategy implements CreditCardValidationStrategy {
    @Override
    public boolean validate(CreditCard creditCard) {
        return creditCard.getNumber().startsWith("9");
    }
}
