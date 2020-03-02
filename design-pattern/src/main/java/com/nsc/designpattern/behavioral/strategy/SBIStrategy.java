package com.nsc.designpattern.behavioral.strategy;

public class SBIStrategy implements CreditCardValidationStrategy {
    @Override
    public boolean validate(CreditCard creditCard) {
        return creditCard.getNumber().startsWith("8");
    }
}
