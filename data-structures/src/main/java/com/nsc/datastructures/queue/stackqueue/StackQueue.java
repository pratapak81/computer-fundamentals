package com.nsc.datastructures.queue.stackqueue;

import java.util.Stack;
import java.util.StringJoiner;

public class StackQueue<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;
    private int size;

    public StackQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    /*************************** Approach 1 ***************************/

    /*
    By making enQueue operation costly
    1. While stack1 is not empty, push everything from stack1 to stack2.
    2. Push element to stack1 (assuming size of stacks is unlimited).
    3. Push everything back to stack1
    */
    public void enQueue(T element) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(element);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        size++;
    }

    /*
    If stack1 is empty then error
    Pop an item from stack1 and return it
    */
    public T deQueue() {
        if (stack1.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        size--;
        return stack1.pop();
    }

    /*************************** Approach 2 ***************************/

    public void testApproach2() {
        stack1.clear();
        stack2.clear();
        size = 0;
    }

    /*
    Push element to stack1 (assuming size of stacks is unlimited)
    */
    public void enQueueApproach2(T element) {
        stack1.push(element);
        size++;
    }

    /*
    By making deQueue operation costly
    1. If both stacks are empty then error
    2. If stack2 is empty
       While stack1 is not empty, push everything from stack1 to stack2.
    3. Pop the element from stack2 and return it.
    */
    public T deQueueApproach2() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        size--;
        return stack2.pop();
    }
}
