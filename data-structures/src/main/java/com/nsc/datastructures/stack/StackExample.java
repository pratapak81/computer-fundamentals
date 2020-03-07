package com.nsc.datastructures.stack;

/**
 * Stacks are used by most languages to store the code flow or function call as the code executes.
 * Stack is a linear data structure which follows a particular order in which the operations are performed.
 * The order may be LIFO(Last In First Out) or FILO(First In Last Out)
 * <p>
 * Core Java Stacks:
 * 1. Stack<E>
 * 2. Deque<E>
 */
public class StackExample {
    public static void main(String[] args) {
        BasicStack<String> basicStack = new BasicStack<>();

        basicStack.push("Pratap");
        basicStack.push("AK");
        basicStack.push("GE");

        System.out.println("Stack Size: " + basicStack.size());
        basicStack.printAll();

        basicStack.pop();
        basicStack.printAll();

        basicStack.pop();
        basicStack.printAll();

        System.out.println("AK exists? " + basicStack.contains("AK"));

        System.out.println(basicStack.access("Pratap"));

        basicStack.access("AK");
    }
}
