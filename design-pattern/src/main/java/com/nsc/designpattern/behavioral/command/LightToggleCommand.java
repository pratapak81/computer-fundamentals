package com.nsc.designpattern.behavioral.command;

// concrete command
public class LightToggleCommand implements Command {

    private Light light;

    public LightToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.toggle();
    }
}
