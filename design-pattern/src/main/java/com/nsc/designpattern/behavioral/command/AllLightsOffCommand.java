package com.nsc.designpattern.behavioral.command;

import java.util.List;

// concrete command
public class AllLightsOffCommand implements Command {

    private List<Light> lightList;

    public AllLightsOffCommand(List<Light> lightList) {
        this.lightList = lightList;
    }

    @Override
    public void execute() {
        lightList.stream().filter(Light::isOn).forEach(Light::toggle);
    }
}
