package com.nsc.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// ConcreteSubject
public class MessageSubject implements Subject {

    private String message;

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(message));
    }

    @Override
    public void send(String message) {
        this.message = message;
        notifyObservers();
    }
}
