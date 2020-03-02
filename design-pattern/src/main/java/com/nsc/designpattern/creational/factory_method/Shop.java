package com.nsc.designpattern.creational.factory_method;

public class Shop extends Website {
    public void createWebsite() {
        pageList.add(new CartPage());
    }
}
