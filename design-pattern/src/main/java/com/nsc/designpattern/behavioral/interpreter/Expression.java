package com.nsc.designpattern.behavioral.interpreter;

/**
 * This pattern is used to represent grammar of a language. Used when parsing various aspects of a grammar.
 * This pattern is used in SQL parsing, symbol processing engine etc.
 * The tree structure of Interpreter design pattern is somewhat similar to that defined by the composite design pattern
 * with terminal expressions being leaf objects and non-terminal expressions being composites
 * <p>
 * Interpreter design pattern has following participants
 * 1. Expression
 * 2. Terminal Expression
 * 3. Non Terminal Expression
 * 4. Context - Interpreter Context (It can be Object also)
 * 5. Client
 * <p>
 * NOTE: context can be an object also
 * <p>
 * Eg:
 * java.lang.Pattern
 * java.text.Format
 * <p>
 * AbstractExpression/Expression: Declares an interpret() operation that all nodes (terminal and non terminal) in the AST overrides.
 * <p>
 * NOTE: This pattern used to define a language than can be interpreted to do things
 * <p>
 * AST - Abstract Syntax Tree
 */
public interface Expression {
    boolean interpret(String context);
}
