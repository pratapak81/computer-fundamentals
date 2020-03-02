package com.nsc.designpattern.behavioral.observer;

// ConcreteObserver
public class PhoneClient implements Observer {
    @Override
    public void update(String message) {
        System.out.println("PhoneClient: " + message);
    }
}
