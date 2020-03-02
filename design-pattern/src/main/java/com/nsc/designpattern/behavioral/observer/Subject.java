package com.nsc.designpattern.behavioral.observer;

/**
 * Observer design pattern has following participants
 * 1. Subject
 * 2. ConcreteSubject
 * 3. Observer
 * 4. ConcreteObserver
 * 5. Client
 * <p>
 * one-to-many pattern. We need this pattern when one subject needs to be observed by many observer(publish/subscribe model)
 * <p>
 * Eg:
 * java.util.Observer
 * java.util.EventListener
 */
public interface Subject {
    void registerObserver(Observer o);

    void unregisterObserver(Observer o);

    void notifyObservers();

    void send(String message);
}
