package com.nsc.designpattern.structural.flyweight;

/**
 * ConcreteFlyweight - Flyweight object. It should have 2 properties intrinsic and extrinsic
 * Flyweight objects are immutable, meaning they won't change once created
 */
public class Terrorist implements Player {

    /*
     Intrinsic Attribute
     Intrinsic properties are those which are common to every object, meaning for every terrorist object task is same
     i.e planting bomb. Like for CounterTerrorist's it's defusing bomb
    */
    private final String TASK;

    /*
     Extrinsic Attribute
     Extrinsic properties are those which are not common to every object, and value has to be provided by client.
     Extrinsic properties differ from object to object
    */
    private String weapon;

    public Terrorist() {
        this.TASK = "PLANT BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }
}
