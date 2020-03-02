package com.nsc.designpattern.behavioral.interpreter;

/**
 * Terminal expression which doesn't contain another expression and it actually evaluates the expression
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
