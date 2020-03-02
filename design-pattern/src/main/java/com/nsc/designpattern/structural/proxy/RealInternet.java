package com.nsc.designpattern.structural.proxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("connecting to " + serverHost);
    }
}
