package com.nsc.designpattern.creational.abstract_factory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(800);

        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(550);
        CreditCard card1 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card1.getClass());
    }
}
