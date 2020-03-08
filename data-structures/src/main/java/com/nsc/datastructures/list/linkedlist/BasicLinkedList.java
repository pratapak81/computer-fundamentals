package com.nsc.datastructures.list.linkedlist;

import java.util.StringJoiner;

public class BasicLinkedList<T> {

    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkedList() {
        first = last = null;
        nodeCount = 0;
    }

    public int size() {
        return nodeCount;
    }

    public void add(T item) {
        Node node = new Node(item);
        if (first == null) {
            first = last = node;
        } else {
            last.setNextNode(node);
            last = node;
        }
        nodeCount++;
    }

    public void insert(T item, int position) {
        if (size() < position) {
            throw new RuntimeException("Position is greater than list size");
        }

        Node currentNode = first;
        for (int i = 1; i < position && currentNode != null; i++) {
            currentNode = currentNode.getNextNode();
        }

        Node newNode = new Node(item);
        Node nextNode = currentNode.getNextNode();
        currentNode.setNextNode(newNode);
        newNode.setNextNode(nextNode);
        nodeCount++;
    }

    // removes the firstNode, we can also have methods like removeFirst, removeLast, removeElementAt(int index)
    public T remove() {
        if (first == null) {
            throw new RuntimeException("Empty list");
        }
        T item = first.getItem();
        first = first.getNextNode();
        nodeCount--;
        return item;
    }

    public T removeAt(int position) {
        if (size() < position) {
            throw new RuntimeException("Can't remove element at position " + position);
        }

        Node currentNode = first;
        for (int i = 1; i < position && currentNode != null; i++) {
            currentNode = currentNode.getNextNode();
        }

        Node nodeToRemove = currentNode.getNextNode();
        T item = nodeToRemove.getItem();
        Node nextNode = nodeToRemove.getNextNode();
        currentNode.setNextNode(nextNode);
        nodeCount--;
        return item;
    }

    public T get(int position) {
        if (size() < position) {
            throw new RuntimeException("Position doesn't exist");
        }

        if (position == 0) {
            return first.getItem();
        }

        Node currentNode = first;
        for (int i = 1; i <= position && currentNode.getNextNode() != null; i++) {
            currentNode = currentNode.getNextNode();
            if (i == position) {
                return currentNode.getItem();
            }
        }
        throw new RuntimeException("Element not found");
    }

    public void printAll() {
        System.out.print("[");
        StringJoiner stringJoiner = new StringJoiner(", ");
        Node currentNode = first;
        for (int i = 0; i < nodeCount && currentNode != null; i++) {
            stringJoiner.add((String) currentNode.getItem());
            currentNode = currentNode.getNextNode();
        }
        System.out.print(stringJoiner.toString());
        System.out.println("]");
    }

    private class Node {
        private Node nextNode;
        private T item;

        public Node(T item) {
            this.nextNode = null;
            this.item = item;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public T getItem() {
            return item;
        }
    }
}
