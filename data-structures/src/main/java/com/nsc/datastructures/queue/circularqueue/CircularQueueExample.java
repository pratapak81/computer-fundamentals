package com.nsc.datastructures.queue.circularqueue;

/**
 * In a normal Queue Data Structure, we can insert elements until queue becomes full.
 * But once if queue becomes full and later if elements are dequeued,
 * we have to shift all the elements every time an element is to be inserted in the queue.
 * <p>
 * For circular queue
 * front = (front + 1) % length;
 * rear = (rear + 1) % length
 * <p>
 * https://www.javainuse.com/java/circular_java
 */
public class CircularQueueExample {
    public static void main(String[] args) {
        CircularQueue<String> circularQueue = new CircularQueue<>();
        circularQueue.enQueue("A");
        circularQueue.enQueue("B");
        circularQueue.enQueue("C");
        circularQueue.enQueue("D");
        circularQueue.enQueue("E");
        circularQueue.enQueue("F");

        circularQueue.printAll();

        System.out.println(circularQueue.deQueue());
        circularQueue.printAll();

        System.out.println(circularQueue.deQueue());
        circularQueue.printAll();

        circularQueue.enQueue("G");
        circularQueue.printAll();
    }
}
