package com.nsc.designpattern.behavioral.command;

import java.util.Arrays;
import java.util.List;

// client
public class CommandDemo {
    public static void main(String[] args) {

        LightSwitch lightSwitch = new LightSwitch();

        Light bedRoomLight = new Light("BedRoom");
        Light bathRoomLight = new Light("BathRoom");
        Light hallLight = new Light("Hall");
        Light toiletLight = new Light("Toilet");

        Command lightOnCommand = new LightOnCommand(bathRoomLight);
        Command lightOffCommand = new LightOffCommand(bathRoomLight);

        Command toiletLightOnCommand = new LightOnCommand(toiletLight);

        lightSwitch.pressed(lightOnCommand);
        lightSwitch.pressed(lightOffCommand);
        lightSwitch.pressed(toiletLightOnCommand);

        System.out.println("============= Toggle Command Example ============");

        Command toggleCommand = new LightToggleCommand(bedRoomLight);
        lightSwitch.pressed(toggleCommand);
        lightSwitch.pressed(toggleCommand);
        lightSwitch.pressed(toggleCommand);

        System.out.println("======= All Lights Off Command =========");

        List<Light> lightList = Arrays.asList(bedRoomLight, bathRoomLight, hallLight, toiletLight);
        Command allLightOffCommand = new AllLightsOffCommand(lightList);
        lightSwitch.pressed(allLightOffCommand);
    }
}
