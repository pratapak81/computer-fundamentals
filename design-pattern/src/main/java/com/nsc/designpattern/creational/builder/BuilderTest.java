package com.nsc.designpattern.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        LunchOrder lunchOrder = new LunchOrder.Builder()
                .bread("white")
                .condiments("greenCandy")
                .dressing("top")
                .meat("chicken")
                .build();
        System.out.println(lunchOrder);

        LunchOrder anotherLunchOrder = LunchOrder.builder()
                .bread("RED")
                .condiments("YELLOW_CANDY")
                .dressing("BOTTOM")
                .meat("MUTTON")
                .build();
        System.out.println(anotherLunchOrder);
    }
}
