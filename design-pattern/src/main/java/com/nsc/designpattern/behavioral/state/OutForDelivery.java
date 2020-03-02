package com.nsc.designpattern.behavioral.state;

public class OutForDelivery implements State {

    //Singleton
    private static OutForDelivery instance = new OutForDelivery();

    private OutForDelivery() {
    }

    public static OutForDelivery getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is out of delivery !!");
        deliveryContext.setCurrentState(Delivered.getInstance());
    }
}
