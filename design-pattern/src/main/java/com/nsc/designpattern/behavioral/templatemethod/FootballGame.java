package com.nsc.designpattern.behavioral.templatemethod;

public class FootballGame extends Game {
    @Override
    void initialize() {
        System.out.println("Initializing Football game");
    }

    @Override
    void startPlay() {
        System.out.println("Start playing Football");
    }

    @Override
    void endPlay() {
        System.out.println("Ending Football game");
    }
}
