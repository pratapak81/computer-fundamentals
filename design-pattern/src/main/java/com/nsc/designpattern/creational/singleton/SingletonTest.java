package com.nsc.designpattern.creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        ConnectionSingleton instance = ConnectionSingleton.getInstance();
        ConnectionSingleton anotherInstance = ConnectionSingleton.getInstance();
        if (instance == anotherInstance) {
            System.out.println("same instances");
        }
    }
}
