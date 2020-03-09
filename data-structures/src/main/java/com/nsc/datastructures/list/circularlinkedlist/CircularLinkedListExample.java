package com.nsc.datastructures.list.circularlinkedlist;

/**
 * Circular linked list is a linked list where all nodes are connected to form a circle.
 * There is no NULL at the end. A circular linked list can be a singly circular linked list or doubly circular linked list.
 * <p>
 * Advantages of Circular Linked Lists:
 * 1. Any node can be a starting point. We can traverse the whole list by starting from any point.
 * We just need to stop when the first visited node is visited again *
 * 2. Useful for implementation of queue. Unlike this implementation, we don’t need to maintain two pointers for front
 * and rear if we use circular linked list. We can maintain a pointer to the last inserted node and front can always
 * be obtained as next of last.
 */
public class CircularLinkedListExample {
    public static void main(String[] args) {
        CircularLinkedList<String> circularLinkedList = new CircularLinkedList<>();

        circularLinkedList.add("A");
        circularLinkedList.add("B");
        circularLinkedList.add("C");

        circularLinkedList.printAll();
    }
}
