package com.nsc.designpattern.behavioral.state;

public class InTransition implements State {

    //Singleton
    private static InTransition instance = new InTransition();

    private InTransition() {
    }

    public static InTransition getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is in transition");
        deliveryContext.setCurrentState(OutForDelivery.getInstance());
    }
}
