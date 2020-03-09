package com.nsc.datastructures.list.circularlinkedlist;

public class CircularLinkedListExample {
    public static void main(String[] args) {
        CircularLinkedList<String> circularLinkedList = new CircularLinkedList<>();

        circularLinkedList.add("A");
        circularLinkedList.add("B");
        circularLinkedList.add("C");

        circularLinkedList.printAll();
    }
}
