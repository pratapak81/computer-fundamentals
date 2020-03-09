package com.nsc.datastructures.list.circularlinkedlist;

import java.util.StringJoiner;

public class CircularLinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        head = tail = null;
        size = 0;
    }

    public void add(T element) {
        Node node = new Node(element);
        if (head == null) {
            head = tail = node;
            tail.setNextNode(head);
        } else {
            node.setNextNode(head);
            tail.setNextNode(node);
            tail = node;
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
        private Node nextNode;
        T data;

        public Node(T data) {
            this.data = data;
            nextNode = null;
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
