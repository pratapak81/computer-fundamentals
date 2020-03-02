package com.nsc.designpattern.behavioral.command;

// receiver
public class Light {

    private String name;
    private boolean isOn = false;

    public Light(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }
    }

    public void on() {
        System.out.println(name + " Light is on");
        isOn = true;
    }

    public void off() {
        System.out.println(name + " Light is off");
        isOn = false;
    }
}
