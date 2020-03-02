package com.nsc.designpattern.behavioral.state;

// state
public class Acknowledged implements State {

    //Singleton
    private static Acknowledged instance = new Acknowledged();

    private Acknowledged() {
    }

    public static Acknowledged getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is Acknowledged!!");
        deliveryContext.setCurrentState(Shipped.getInstance());
    }
}
