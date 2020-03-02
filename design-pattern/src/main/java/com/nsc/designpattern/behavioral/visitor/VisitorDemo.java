package com.nsc.designpattern.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.addPart(new Mouse());
        computer.addPart(new KeyBoard());

        computer.accept(new ComputerPartDisplayVisitor());
    }
}
