package com.nsc.designpattern.behavioral.chainofresponsibility;

/**
 * client - Originator of request and this will access the handler to handle it
 * <p>
 * Real world example:
 * We have VP, CEO, DIRECTOR and Manager, and each one can approve different purchase request from employees.
 * Eg:
 * Manager can approve purchase request less than 5000
 * Director can approve purchase request less than 50000
 * CEO can approve purchase request less than 100000
 * VP can approve any request
 * Employee makes purchase request and it goes to manager first. If manager is able to handle, he will handle it or else he pass it to next level.
 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler negativeProcessor = new NegativeProcessor();
        Handler zeroProcessor = new ZeroProcessor();
        Handler positiveProcessor = new PositiveProcessor();

        negativeProcessor.setNextHandler(zeroProcessor);
        zeroProcessor.setNextHandler(positiveProcessor);

        negativeProcessor.process(new Number(90));
        negativeProcessor.process(new Number(0));
        negativeProcessor.process(new Number(-80));
    }
}
