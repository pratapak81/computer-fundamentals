package com.nsc.designpattern.structural.flyweight;

import java.util.HashMap;

/**
 * Flyweight pattern is used when we need to create a large number of similar objects
 * One important feature of flyweight objects is that they are immutable. This means that they cannot be modified once they have been constructed
 * It is a pattern which minimizes memory usage (more efficient use of memory)
 * Can be used when objects are immutable and has intrinsic and extrinsic attributes
 * Eg: String, java.lang.Integer#valueOf(), Boolean, Byte, Character, Short, Long
 * <p>
 * Flyweight pattern uses factory pattern to receive Flyweight object after they have been created
 * <p>
 * It has following participants
 * 1. Flyweight
 * 2. ConcreteFlyweight
 * 3. Factory
 * 4. Client
 * <p>
 * Flyweight design pattern used for premature optimization and deals with immutable objects and help in memory optimization
 */
public class PlayerFactory {

    private static final HashMap<String, Player> playerHashMap = new HashMap<>();

    private PlayerFactory() {}

    public static Player getPlayer(String type) {
        Player player = null;
        if (playerHashMap.containsKey(type)) {
            player = playerHashMap.get(type);
        } else if("Terrorist".equals(type)){
            player = new Terrorist();
        } else if("CounterTerrorist".equals(type)) {
            player = new CounterTerrorist();
        }
        if (player != null) {
            playerHashMap.put(type, player);
        }
        return player;
    }
}
