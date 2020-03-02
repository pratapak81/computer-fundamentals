package com.nsc.designpattern.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {

        PhoneClient phoneClient = new PhoneClient();
        TabletClient tabletClient = new TabletClient();

        Subject subject = new MessageSubject();
        subject.registerObserver(phoneClient);
        subject.registerObserver(tabletClient);
        subject.send("hello");

        subject.unregisterObserver(tabletClient);
        subject.send("Again Hi Hello!!");

        System.out.println("========================");
        System.out.println("Another type of Observer");

        DesktopClient desktopClient = new DesktopClient(subject);
        desktopClient.sendDesktopMessage("Desktop message");
    }
}
