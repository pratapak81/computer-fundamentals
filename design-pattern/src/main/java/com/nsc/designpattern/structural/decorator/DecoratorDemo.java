package com.nsc.designpattern.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());

        Sandwich anotherSandwich = new MeatDecorator(new DressingDecorator(new SimpleSandwich()));
        System.out.println(anotherSandwich.make());
    }
}
