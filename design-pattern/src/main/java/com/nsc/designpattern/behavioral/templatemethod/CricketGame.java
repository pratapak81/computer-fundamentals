package com.nsc.designpattern.behavioral.templatemethod;

public class CricketGame extends Game {
    @Override
    void initialize() {
        System.out.println("Initializing cricket game");
    }

    @Override
    void startPlay() {
        System.out.println("Start playing cricket");
    }

    @Override
    void endPlay() {
        System.out.println("Ending cricket game");
    }
}
