package com.nsc.datastructures.queue.stackqueue;

/**
 * Queue using stack instead of array.
 * In order to implement Queue functionality using Stack, we need two stacks
 */
public class StackQueueExample {
    public static void main(String[] args) {
        StackQueue<String> stackQueue = new StackQueue<>();

        stackQueue.enQueue("A");
        stackQueue.enQueue("B");
        stackQueue.enQueue("C");

        System.out.println("/***************** Approach 1 testing start *****************");
        System.out.println("removed element = " + stackQueue.deQueue());
        System.out.println("removed element = " + stackQueue.deQueue());
        System.out.println("removed element = " + stackQueue.deQueue());
        System.out.println("/***************** Approach 1 testing end *****************");

        stackQueue.testApproach2();
        stackQueue.enQueueApproach2("X");
        stackQueue.enQueueApproach2("Y");
        stackQueue.enQueueApproach2("Z");

        System.out.println("/***************** Approach 2 testing start *****************");
        System.out.println("removed element = " + stackQueue.deQueueApproach2());
        System.out.println("removed element = " + stackQueue.deQueueApproach2());
        System.out.println("removed element = " + stackQueue.deQueueApproach2());
        System.out.println("/***************** Approach 2 testing end *****************");
    }
}
