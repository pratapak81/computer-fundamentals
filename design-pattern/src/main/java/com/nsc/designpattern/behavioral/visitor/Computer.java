package com.nsc.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteVisitable/ConcreteElement : These classes implement the Visitable interface or class and defines the accept operation.
 * The visitor object is passed to this object using the accept operation
 */
public class Computer implements ComputerPart {

    private List<ComputerPart> computerPartList = new ArrayList<>();

    public void addPart(ComputerPart computerPart) {
        computerPartList.add(computerPart);
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        computerPartList.forEach(computerPart -> computerPart.accept(visitor));
        visitor.visit(this);
    }
}
