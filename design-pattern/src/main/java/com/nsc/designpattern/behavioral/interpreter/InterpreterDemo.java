package com.nsc.designpattern.behavioral.interpreter;

/**
 * client - Builds (or is provided) the AST assembled from TerminalExpression and NonTerminalExpression.
 * The Client invokes the interpret() operation
 * <p>
 * AST - Abstract Syntax Tree
 * <p>
 * Eg: in Hibernate or Spring Data or MongoTemplate while framing queries we will use interpreter pattern
 */
public class InterpreterDemo {
    public static void main(String[] args) {
        /*String context = "Lions tigers";
        Expression expression = new TerminalExpression("lion");
        System.out.println(expression.interpret(context));*/

        String context = "lions tigers";

        Expression lionExpression = new TerminalExpression("lion");
        Expression bearExpression = new TerminalExpression("bear");

        Expression lionOrBearExpression = new OrExpression(lionExpression, bearExpression);
        System.out.println(lionOrBearExpression.interpret(context));

        Expression lionAndBearExpression = new AndExpression(lionExpression, bearExpression);
        System.out.println(lionAndBearExpression.interpret(context));

        Expression tigerExpression = new TerminalExpression("tiger");
        Expression lionOrBearAndTigerExpression = new AndExpression(lionOrBearExpression, tigerExpression);
        System.out.println(lionOrBearAndTigerExpression.interpret(context));
    }
}
