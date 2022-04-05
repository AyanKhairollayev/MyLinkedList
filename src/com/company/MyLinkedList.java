package com.company;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    public MyLinkedList() {
    }

    public int get(int index) {
        if (index == 1) {
            return head.getVal();
        }

        if (head.getNext() == null) {
            return -1;
        }

        Node next = head.getNext();

        for (int i = 1; i < index - 1; i++) {
            if (next.getNext() == null) {
                return -1;
            }

            next = next.getNext();
        }

        return next.getVal();
    }

    public void addAtHead(int val) {
        if (size == 0) {

            head = new Node(val, null);
            tail = new Node(head.getVal(), head.getNext());
            size++;

        } else {
            Node oldHead = new Node(head.getVal(), head.getNext());
            head.setVal(val);
            head.setNext(oldHead);
            size++;
        }
    }

    public void addAtTail(int val) {
        Node node = new Node(val, null);
        Node cur = head;

        while (cur.getNext() != null) {
            cur = cur.getNext();
        }

        cur.setNext(node);
        tail.setVal(node.getVal());
        tail.setNext(null);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index == 1) {
            addAtHead(val);
            return;
        }

        if(index == size) {
            addAtTail(val);
            return;
        }

        Node cur = head;

        for(int i = 1; i < index - 1; i++) {
            cur = cur.getNext();
        }

        Node newNode = new Node(val, cur.getNext());
        cur.setNext(newNode);
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index == 1) {
            head = head.getNext();
        } else if(index == size) {
            Node cur = head;

            for(int i = 1; i < index - 1; i++) {
                cur = cur.getNext();
            }

            tail = cur;
        } else {
            Node cur = head;

            for(int i = 1; i < index - 1; i++) {
                cur = cur.getNext();
            }

            cur.setNext(cur.getNext().getNext());
        }

        size--;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }
}
