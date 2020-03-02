package com.nsc.designpattern.behavioral.state;

public class Shipped implements State {

    //Singleton
    private static Shipped instance = new Shipped();

    private Shipped() {
    }

    public static Shipped getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is shipped");
        deliveryContext.setCurrentState(InTransition.getInstance());
    }
}
