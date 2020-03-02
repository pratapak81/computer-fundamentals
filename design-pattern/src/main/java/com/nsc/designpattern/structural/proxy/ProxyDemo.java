package com.nsc.designpattern.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) throws IllegalAccessException {
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("abc.com");
    }
}
