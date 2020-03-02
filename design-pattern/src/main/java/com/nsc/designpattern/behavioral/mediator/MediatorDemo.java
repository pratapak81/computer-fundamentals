package com.nsc.designpattern.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();

        User pratap = new UserImpl("Pratap", chatMediator);
        User ak = new UserImpl("A K", chatMediator);
        User mahesh = new UserImpl("Mahesh", chatMediator);
        User suresh = new UserImpl("Suresh", chatMediator);

        chatMediator.addUser(pratap);
        chatMediator.addUser(ak);
        chatMediator.addUser(mahesh);
        chatMediator.addUser(suresh);

        pratap.sendMessage("Hello All");
        System.out.println("===============");
        suresh.sendMessage("Hello Pratap");
    }
}
