package com.company;

public class HashTable<K, V> {
    private int size;
    private int numOfBuckets;
    private MyLinkedList<K> myLinkedList;

    public HashTable() {
        size = 0;
        numOfBuckets = 10;
        myLinkedList = new MyLinkedList<>();
    }

    public V get(K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public int getSize() {
        return size;
    }

    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            myLinkedList.append(myMapNode);
            size++;
        } else {
            myMapNode.setValue(value);
        }
    }

    public void remove(K key) {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int getIndex(K key) {
        return key.hashCode() % numOfBuckets;
    }
}
