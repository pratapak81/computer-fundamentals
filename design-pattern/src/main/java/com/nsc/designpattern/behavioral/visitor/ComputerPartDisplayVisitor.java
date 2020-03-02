package com.nsc.designpattern.behavioral.visitor;

/**
 * ConcreteVisitor : For each type of visitor all the visit methods, declared in abstract visitor, must be implemented.
 * Each Visitor will be responsible for different operations
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying mouse");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("Displaying keyboard");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying computer");
    }
}
