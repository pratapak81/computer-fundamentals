package com.nsc.datastructures.list.doublylinkedlist;

/**
 * A Doubly Linked List (DLL) contains an extra pointer, typically called previous pointer, together with next pointer
 * and data which are there in singly linked list
 * <p>
 * Advantages over singly linked list:
 * 1. A DLL can be traversed in both forward and backward direction.
 * 2. The delete operation in DLL is more efficient if pointer to the node to be deleted is given.
 * 3. We can quickly insert a new node before a given node.
 */
public class DoublyLinkedListExample {
    public static void main(String[] args) {
        BasicDoublyLinkedList<String> basicDoublyLinkedList = new BasicDoublyLinkedList<>();
        System.out.println("Is Empty? " + basicDoublyLinkedList.isEmpty());

        basicDoublyLinkedList.add("A");
        basicDoublyLinkedList.add("B");
        basicDoublyLinkedList.add("C");

        basicDoublyLinkedList.printAll();
        basicDoublyLinkedList.printAllReverse();

        System.out.println("Size= " + basicDoublyLinkedList.size());

        System.out.println("Removed element " + basicDoublyLinkedList.remove());
        basicDoublyLinkedList.printAll();
        System.out.println("Size= " + basicDoublyLinkedList.size());

        System.out.println("Is A exist? " + basicDoublyLinkedList.contains("A"));
        System.out.println("Is B exist? " + basicDoublyLinkedList.contains("B"));

        basicDoublyLinkedList.add("D");
        basicDoublyLinkedList.printAll();

        basicDoublyLinkedList.insert("X", 1);
        basicDoublyLinkedList.printAll();

        System.out.println("removed element " + basicDoublyLinkedList.removeAt(2));
        basicDoublyLinkedList.printAll();
    }
}
