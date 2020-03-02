package com.nsc.designpattern.behavioral.memento;

/**
 * Memento pattern is used to restore state of an object to a previous state
 * memento : the object that is going to maintain the state of originator. Its just a POJO.
 * <p>
 * Memento design pattern has following 4 participants
 * 1. Originator - object whose state needs to be saved
 * 2. Memento - object which maintains the state
 * 3. CareTaker - object that keeps track of multiple memento
 * <p>
 * Eg:
 * java.lang.Serializable
 */
public class EmployeeMemento {
    private String name;
    private String phone;

    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
