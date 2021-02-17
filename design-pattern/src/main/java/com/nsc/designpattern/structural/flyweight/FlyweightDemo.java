package com.nsc.designpattern.structural.flyweight;

import java.util.Random;

/**
 * Client
 */
public class FlyweightDemo {

    private static final String[] playerType =
            {"Terrorist", "CounterTerrorist"};
    private static final String[] weapons =
            {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayer(playerType[new Random().nextInt(2)]);
            player.assignWeapon(weapons[new Random().nextInt(4)]);
            player.mission();
        }

        System.out.println("=================================");
        System.out.println("Test - We are reusing the objects");

        Player terrorist = PlayerFactory.getPlayer("Terrorist");
        Player counterTerrorist = PlayerFactory.getPlayer("CounterTerrorist");

        Player terrorist1 = PlayerFactory.getPlayer("Terrorist");
        Player counterTerrorist1 = PlayerFactory.getPlayer("CounterTerrorist");

        System.out.println(System.identityHashCode(terrorist));
        System.out.println(System.identityHashCode(terrorist1));

        System.out.println(System.identityHashCode(counterTerrorist));
        System.out.println(System.identityHashCode(counterTerrorist1));
    }
}
