package com.nsc.designpattern.creational.singleton;

/**
 * Only one instance needed
 * Lazy initialized singleton class
 * Eg: Runtime, Logger, Spring Beans etc
 */
public class ConnectionSingleton {

    private static volatile ConnectionSingleton instance;

    private ConnectionSingleton() {
        if (instance != null) {
            throw new RuntimeException("Please use getInstance() method");
        }
    }

    public static ConnectionSingleton getInstance() {
        if (instance == null) {
            synchronized (ConnectionSingleton.class) {
                if (instance == null) {
                    instance = new ConnectionSingleton();
                }
            }
        }
        return instance;
    }
}
