package com.nsc.designpattern.behavioral.strategy;

public class ICICIStrategy implements CreditCardValidationStrategy {
    @Override
    public boolean validate(CreditCard creditCard) {
        return creditCard.getNumber().startsWith("7");
    }
}
