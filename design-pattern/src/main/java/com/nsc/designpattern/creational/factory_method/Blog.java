package com.nsc.designpattern.creational.factory_method;

public class Blog extends Website {
    public void createWebsite() {
        pageList.add(new CommentPage());
    }
}
