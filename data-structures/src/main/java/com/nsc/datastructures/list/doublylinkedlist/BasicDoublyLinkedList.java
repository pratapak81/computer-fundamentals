package com.nsc.datastructures.list.doublylinkedlist;

import java.util.StringJoiner;

public class BasicDoublyLinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public BasicDoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void add(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.setPreviousNode(tail);
            tail.setNextNode(node);
        }
        tail = node;
        size++;
    }

    public void insert(T element, int position) {
        if (size() < position) {
            throw new RuntimeException("Position out of range");
        }

        Node node = new Node(element);

        if (head == null) {
            head = tail = node;
            size++;
            return;
        }

        int counter = 0;
        Node currentNode = head;
        while (currentNode != null) {
            if (counter == position) {
                Node previousNode = currentNode.getPreviousNode();

                node.setPreviousNode(previousNode);
                previousNode.setNextNode(node);

                node.setNextNode(currentNode);
                currentNode.setPreviousNode(node);
                size++;
                return;
            }
            counter++;
            currentNode = currentNode.nextNode;
        }
        throw new RuntimeException("unable to insert at this position");
    }

    public T remove() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        T data = head.getData();
        head = head.getNextNode();
        head.setPreviousNode(null);
        size--;
        return data;
    }

    // handle edge cases
    public T removeAt(int position) {
        if (size() < position) {
            throw new RuntimeException("Position out of range");
        }
        int counter = 0;
        Node currentNode = head;
        while (currentNode != null) {
            if (counter == position) {
                Node previousNode = currentNode.getPreviousNode();
                Node nextNode = currentNode.getNextNode();

                previousNode.setNextNode(nextNode);
                nextNode.setPreviousNode(previousNode);
                size--;
                return currentNode.getData();
            }
            counter++;
            currentNode = currentNode.getNextNode();
        }
        throw new RuntimeException("Element not found to remove");
    }

    public boolean contains(T element) {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData().equals(element)) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }

    public void printAll() {
        System.out.print("[");
        StringJoiner stringJoiner = new StringJoiner(", ");

        Node currentNode = head;
        while (currentNode != null) {
            stringJoiner.add((String) currentNode.getData());
            currentNode = currentNode.getNextNode();
        }

        System.out.print(stringJoiner.toString());
        System.out.println("]");
    }

    public void printAllReverse() {
        System.out.print("[");
        StringJoiner stringJoiner = new StringJoiner(", ");

        Node currentNode = tail;
        while (currentNode != null) {
            stringJoiner.add((String) currentNode.getData());
            currentNode = currentNode.getPreviousNode();
        }

        System.out.print(stringJoiner.toString());
        System.out.println("]");
    }

    private class Node {
        private Node previousNode;
        private T data;
        private Node nextNode;

        public Node(T data) {
            this.data = data;
            previousNode = nextNode = null;
        }

        public Node getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(Node previousNode) {
            this.previousNode = previousNode;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public T getData() {
            return data;
        }
    }
}
