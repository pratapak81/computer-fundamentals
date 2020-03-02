package com.nsc.designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteMediator encapsulates the interaction logic between Colleague objects
 */
public class ChatMediator implements Mediator {

    private List<User> userList;

    public ChatMediator() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        userList.stream().filter(u -> u != user).forEach(u -> u.receiveMessage(message));
    }

    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }
}
