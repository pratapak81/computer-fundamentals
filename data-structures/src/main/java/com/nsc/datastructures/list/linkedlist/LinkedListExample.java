package com.nsc.datastructures.list.linkedlist;

/**
 * A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
 * The elements in a linked list are linked using pointers
 * <p>
 * List Characteristics
 * Add, Remove, Insert, RemoveAt, find, get
 * <p>
 * Core Java Lists:
 * List<E>
 * Vector<E>
 * ArrayList<E>
 */
public class LinkedListExample {
    public static void main(String[] args) {
        BasicLinkedList<String> basicLinkedList = new BasicLinkedList<>();
        basicLinkedList.add("Pratap");
        basicLinkedList.add("AK");
        basicLinkedList.add("GE");

        System.out.println("Size: " + basicLinkedList.size());
        basicLinkedList.printAll();

        basicLinkedList.insert("WhiteField", 1);

        System.out.println("Size: " + basicLinkedList.size());
        basicLinkedList.printAll();

        System.out.println("2 position element removed: " + basicLinkedList.removeAt(2));

        System.out.println("Size: " + basicLinkedList.size());
        basicLinkedList.printAll();

        System.out.println("Remove method removes first element: " + basicLinkedList.remove());

        System.out.println("Size: " + basicLinkedList.size());
        basicLinkedList.printAll();

        basicLinkedList.insert("Bengaluru", 2);

        System.out.println("Size: " + basicLinkedList.size());
        basicLinkedList.printAll();

        System.out.println("Element at position 2: " + basicLinkedList.get(3));
    }
}
