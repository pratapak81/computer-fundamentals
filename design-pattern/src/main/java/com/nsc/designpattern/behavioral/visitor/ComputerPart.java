package com.nsc.designpattern.behavioral.visitor;

/**
 * Visible/Element - This is an interface which declares the accept operation.
 * This is the entry point which enables an object to be “visited” by the visitor object
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
