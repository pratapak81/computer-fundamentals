package com.nsc.datastructures.stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class BasicStack<T> {

    // we can also use ArrayList like java.util.Stack
    private T[] data;
    //private Object[] data;
    private int stackPointer;

    @SuppressWarnings("unchecked")
    public BasicStack() {
        data = (T[]) new Object[1000];
        //data = new Object[100];
        stackPointer = 0;
    }

    public void push(T element) {
        // ensure capacity before adding element
        data[stackPointer++] = element;
    }

    public T pop() {
        if (stackPointer == 0) {
            throw new EmptyStackException();
        }
        //In actual Stack implementation element will be removed from data array after pop
        return data[--stackPointer];
    }

    public boolean contains(T element) {
        for (int i = 0; i < stackPointer; i++) {
            if (data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    // should not use pop inside access, since pop removes the element
    public T access(T element) {
        for (int i = 0; i < stackPointer; i++) {
            if (data[i].equals(element)) {
                return data[i];
            }
        }
        throw new NoSuchElementException();
    }

    public int size() {
        return stackPointer;
    }

    // dummy method to print all the elements
    public void printAll() {
        System.out.print("[");
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (int i = 0; i < stackPointer; i++) {
            stringJoiner.add((String) data[i]);
        }
        System.out.print(stringJoiner.toString());
        System.out.println("]");
    }
}
