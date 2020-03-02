package com.nsc.designpattern.creational.abstract_factory;

/**
 * factory of factories. Factory of related objects
 * It works based on common interface
 * This design pattern is implemented with a factory but hides the factory.
 * Eg: DocumentBuilderFactory
 */
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmericanExpressFactory();
        }
        return new VisaFactory();
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
