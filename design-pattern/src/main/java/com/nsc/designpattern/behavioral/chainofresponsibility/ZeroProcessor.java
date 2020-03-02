package com.nsc.designpattern.behavioral.chainofresponsibility;

public class ZeroProcessor implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void process(Number number) {
        if (number.getNumber() == 0) {
            System.out.println("Zero Processor " + number.getNumber());
        } else {
            nextHandler.process(number);
        }
    }
}
