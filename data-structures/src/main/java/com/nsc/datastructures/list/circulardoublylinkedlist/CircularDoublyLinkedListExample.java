package com.nsc.datastructures.list.circulardoublylinkedlist;

/**
 * Doubly Circular linked list has both the properties of doubly linked list and circular linked list
 * Advantages:
 * 1. List can be traversed both ways from head to tail as well as tail to head
 * 2. Being a circular linked list tail can be reached with one operation from head node
 * 3. Node traversal from any direction is possible and also jumping from head to tail or from tail to head is only one operation
 */
public class CircularDoublyLinkedListExample {
    public static void main(String[] args) {
        CircularDoublyLinkedList<String> circularDoublyLinkedList = new CircularDoublyLinkedList<>();

        circularDoublyLinkedList.add("A");
        circularDoublyLinkedList.add("B");
        circularDoublyLinkedList.add("C");
        circularDoublyLinkedList.add("D");

        circularDoublyLinkedList.printAll();
    }
}
