package com.nsc.designpattern.behavioral.observer;

// ConcreteObserver
public class TabletClient implements Observer {
    @Override
    public void update(String message) {
        System.out.println("TabletClient: " + message);
    }
}
