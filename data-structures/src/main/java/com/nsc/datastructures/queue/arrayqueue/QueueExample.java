package com.nsc.datastructures.queue.arrayqueue;

/**
 * A Queue is a linear structure which follows a particular order in which the operations are performed. The order is First In First Out (FIFO)
 * A Queue is an ordered line or sequence
 * <p>
 * Queue Characteristics:
 * 1. enQueue (insert)
 * 2. deQueue (delete)
 * 3. Search
 * 4. Access
 * <p>
 * Note: most of the Queue implementations doesn't allow null values.
 * <p>
 * Core Java Queues:
 * 1. Queue<E>
 * ArrayBLockingQueue, ArrayDeque, ConcurrentLinkedDeque, ConcurrentLinkedQueue, DelayQueue, LinkedBlockingDeque,
 * LinkedBlockingQueue, LinkedList, LinkedTransferQueue, PriorityBlockingQueue, PriorityQueue, SynchronousQueue
 * https://docs.oracle.com/javase/tutorial/collections/implementations/queue.html
 */
public class QueueExample {
    public static void main(String[] args) {
        BasicQueue<String> basicQueue = new BasicQueue<>();

        basicQueue.enQueue("Pratap");
        basicQueue.enQueue("AK");
        basicQueue.enQueue("GE");

        System.out.println("Size: " + basicQueue.size());
        basicQueue.printAll();

        System.out.println("GE exist? " + basicQueue.contains("GE"));
        System.out.println("UNKNOWN exist? " + basicQueue.contains("UNKNOWN"));

        System.out.println("element at index 2 is " + basicQueue.access(2));
        System.out.println("element at index 0 is " + basicQueue.access(0));

        System.out.println("Removed " + basicQueue.deQueue());
        ;
        System.out.println("Size: " + basicQueue.size());
        basicQueue.printAll();

        System.out.println("element at index 0 is now  " + basicQueue.access(0));

    }
}
