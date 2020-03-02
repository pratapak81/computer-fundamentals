package com.nsc.designpattern.behavioral.visitor;

/**
 * ConcreteVisitable/ConcreteElement : These classes implement the Visitable interface or class and defines the accept operation.
 * The visitor object is passed to this object using the accept operation
 */
public class KeyBoard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
