package com.nsc.designpattern.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        DeliveryContext deliveryContext = new DeliveryContext(null);

        deliveryContext.updatePackageState(); // 1st state, Acknowledge
        deliveryContext.updatePackageState(); // 2nd state, Shipped
        deliveryContext.updatePackageState(); // 3rd state, InTransition
        deliveryContext.updatePackageState(); // 4th state, OutForDelivery
        deliveryContext.updatePackageState(); // 5th state, Delivered
    }
}
