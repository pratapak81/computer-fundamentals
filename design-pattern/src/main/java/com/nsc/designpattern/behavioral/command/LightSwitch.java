package com.nsc.designpattern.behavioral.command;

// Invoker
public class LightSwitch {

    public void pressed(Command command) {
        command.execute();
    }
}
