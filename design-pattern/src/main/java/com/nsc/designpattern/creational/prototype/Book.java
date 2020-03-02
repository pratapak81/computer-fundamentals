package com.nsc.designpattern.creational.prototype;

public class Book extends Item {
    private int pagesCount;

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }
}
