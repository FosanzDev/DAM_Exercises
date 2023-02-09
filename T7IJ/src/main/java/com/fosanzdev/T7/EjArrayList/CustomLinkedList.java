package com.fosanzdev.T7.EjArrayList;

public class CustomLinkedList {
    private Node first;
    private Node last;

    public CustomLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void add(double value) {
        Node node = new Node(value);

        if (isEmpty()) {
            first = node;

        } else {
            last.setNext(node);
        }

        last = node;

    }

    public boolean isEmpty() {
        return first == null;
    }


    // ------------------ Node ------------------
    public class Node {
        private double data;
        private Node next;

        public Node(double data) {
            this.data = data;
            this.next = null;
        }

        public double getData() {
            return data;
        }

        public void setData(double data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
