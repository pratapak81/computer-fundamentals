package com.nsc.designpattern.creational.factory_method;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pageList = new ArrayList<Page>();

    public Website() {
        this.createWebsite();
    }

    public List<Page> getPageList() {
        return pageList;
    }

    // factory method
    public abstract void createWebsite();
}
