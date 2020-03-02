package com.nsc.designpattern.behavioral.templatemethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Game game = new CricketGame();
        game.playGame();

        game = new FootballGame();
        game.playGame();
    }
}
