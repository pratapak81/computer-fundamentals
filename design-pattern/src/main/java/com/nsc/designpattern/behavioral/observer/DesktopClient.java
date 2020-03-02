package com.nsc.designpattern.behavioral.observer;

// ConcreteObserver
public class DesktopClient implements Observer {

    private Subject subject;

    public DesktopClient(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println("DesktopClient: " + message);
    }

    public void sendDesktopMessage(String message) {
        subject.send(message);
    }

    public void deRegister() {
        subject.unregisterObserver(this);
    }
}
