package com.nsc.designpattern.behavioral.chainofresponsibility;

/**
 * concrete handler - These are actual handlers of the request chained in some sequential order
 */
public class NegativeProcessor implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void process(Number number) {
        if (number.getNumber() < 0) {
            System.out.println("Negative Processor " + number.getNumber());
        } else {
            nextHandler.process(number);
        }
    }
}
