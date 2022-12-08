package com.company;

public class MyLinkedList<K> {
    private INode<K> head;
    private INode<K> tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public void append(INode<K> newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.setNext(newNode);
        tail = newNode;
    }

    public void add(INode<K> newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void printMyNodes() {
        System.out.println("My Nodes:" + head);
    }

    public INode<K> search(K key) {
        if (head == null) {
            return null;
        }
        INode<K> tempNode = head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
}
