package com.nsc.designpattern.behavioral.visitor;

/**
 * Visitor is a behavioral design pattern that allows adding new behaviors to existing class hierarchy without altering any existing code
 * It is used when we have to perform an operation on a group of similar kind of Objects.
 * With the help of visitor pattern, we can move the operational logic from the objects to another class
 * 1. a method called Visit() which is implemented by the visitor and is called for every element in the data structure
 * 2. visitable classes providing Accept() methods that accept a visitor
 * <p>
 * Visitor design pattern has following participants
 * 1. Element - interface with accept method
 * 2. ConcreteElement - actual object which should accept a visitor
 * 3. Visitor - interface with visit method
 * 4. ConcreteVisitor
 * 5. Client
 * <p>
 * Each element should accept a visitor and each visitor should able to visit all the elements
 * <p>
 * Visitor - This is an interface or an abstract class used to declare the visit operations for all the types of visitable classes
 */
public interface ComputerPartVisitor {
    void visit(Mouse mouse);

    void visit(KeyBoard keyBoard);

    void visit(Computer computer);
}
