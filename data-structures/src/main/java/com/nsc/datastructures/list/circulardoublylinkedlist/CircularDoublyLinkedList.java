package com.nsc.datastructures.list.circulardoublylinkedlist;

import java.util.StringJoiner;

public class CircularDoublyLinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public CircularDoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public void add(T element) {
        Node node = new Node(element);
        if (head == null) {
            head = tail = node;
            tail.setNextNode(head);
            head.setPreviousNode(tail);
        } else {
            node.setNextNode(head);
            node.setPreviousNode(tail);
            tail.setNextNode(node);
            tail = node;
            head.setPreviousNode(tail);
        }
        size++;
    }

    public void printAll() {
        System.out.print("[");
        StringJoiner stringJoiner = new StringJoiner(", ");
        Node currentNode = head;
        do {
            stringJoiner.add((String) currentNode.getData());
            currentNode = currentNode.getNextNode();
        } while (currentNode != head);
        System.out.print(stringJoiner.toString());
        System.out.println("]");
    }

    private class Node {
        private Node previousNode;
        private Node nextNode;
        private T data;

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
