package com.nsc.designpattern.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        CreditCard hdfcCreditCard = new CreditCard(new HDFCStrategy());
        hdfcCreditCard.setNumber("987899");
        CreditCard sbiCreditCard = new CreditCard(new SBIStrategy());
        sbiCreditCard.setNumber("887899");
        CreditCard iciciCreditCard = new CreditCard(new ICICIStrategy());
        iciciCreditCard.setNumber("897896");

        System.out.println("hdfcCreditCard is valid? " + hdfcCreditCard.isValid());
        System.out.println("sbiCreditCard is valid? " + sbiCreditCard.isValid());
        System.out.println("iciciCreditCard is valid? " + iciciCreditCard.isValid());
    }
}
