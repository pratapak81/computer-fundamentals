package com.nsc.designpattern.behavioral.state;

public class Delivered implements State {

    //Singleton
    private static Delivered instance = new Delivered();

    private Delivered() {
    }

    public static Delivered getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is delivered!!");
    }
}
