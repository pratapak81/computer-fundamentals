package com.nsc.designpattern.behavioral.strategy;

// context
public class CreditCard {
    private String number;
    private String date;
    private String cvv;
    private CreditCardValidationStrategy creditCardValidationStrategy;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CreditCard(CreditCardValidationStrategy creditCardValidationStrategy) {
        this.creditCardValidationStrategy = creditCardValidationStrategy;
    }

    public boolean isValid() {
        return this.creditCardValidationStrategy.validate(this);
    }
}
