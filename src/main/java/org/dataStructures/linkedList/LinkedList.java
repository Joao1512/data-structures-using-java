package org.dataStructures.linkedList;

public class LinkedList<T> implements List<T>{

    private Node<T> head;
    private Node<T> tail;
    private Integer size = 0;

    @Override
    public Integer size() {
        return this.size;
    }

    @Override
    public Boolean empty() {
        return this.size <= 0;
    }

    @Override
    public T valueAt(Integer index) {
        Node<T> auxNode = this.head;
        if (index >= this.size) {
            throw new IndexOutOfBoundsException("index must be minor than list size.");
        }
        for (int i = 0; i < index; i++) {
            auxNode = auxNode.getNext();
        }
        return auxNode.getData();
    }

    @Override
    public void pushFront(T data) {
        Node<T> newNode = new Node<T>(data);
        if (this.head != null) {
            newNode.setNext(this.head);
        }
        else {
            this.tail = newNode;
        }
        this.head = newNode;
        this.size++;
    }

    @Override
    public void pushBack(T data) {
        Node<T> newNode = new Node<T>(data);
        if (this.head != null) { // In case list isn't empty
            this.tail.setNext(newNode); // Node at tail will point to newNode because newNode became tail.
        }
        else {
            this.head = newNode; // if list is empty, so newNode is the only element. It turns newElement into head and tail at the same time.
        }
        this.tail = newNode; // Saving reference to new tail.
        this.size++;
    }

    @Override
    public void popFront() {
        this.head = this.head.getNext();
        this.size--;
    }

    @Override
    public void popBack() {
        if (this.size == 1) { // True means that there's only one element. So it'll set null for both head and tail.
            this.head = null;
            this.tail = null;
            this.size--;
        }
        else if (this.size > 1){ // go through nodes to find the second last node, it will become tail.
            Node<T> auxNode = this.head;
            for (int i = 0; i < this.size - 2; i++) {
                auxNode = auxNode.getNext();
            }
            this.tail = auxNode;
            this.size--;
        }
    }

    @Override
    public T front() {
        if (!this.empty()) return this.head.getData();
        return null;
    }

    @Override
    public T back() {
        if (!this.empty()) return this.tail.getData();
        return null;
    }

    @Override
    public void set(T data, Integer index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("index must be minor than list size.");
        }
        Node<T> newNode = new Node<>(data);
        if (this.size == 1 && index == 0) { // If there's only one element and index passed is 0.
            this.head = newNode;
            this.tail = newNode;
        }
        else if (index == 0) { // if there are multiple nodes and set is at index 0.
            newNode.setNext(this.head.getNext());
            this.head = newNode;
        }
        else {
            Node<T> auxNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                auxNode = auxNode.getNext();
            }
            newNode.setNext(auxNode.getNext());
            auxNode.setNext(newNode);
        }
        if (this.size - 1 == index) { // If there are multiple nodes and index passed is the same as tail.
            this.tail = newNode;
        }
    }

    @Override
    public void erase(Integer index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("index must be minor than list size.");
        }
        if (this.size == 1 && index == 0) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
        else if (index == 0) {
            this.head = this.head.getNext();
        }
        else {
            Node<T> auxNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                auxNode = auxNode.getNext();
            }
            Node<T> tempNextNode = auxNode.getNext();
            auxNode.setNext(tempNextNode.getNext());
        }
        if (this.size - 1 == index) {
            this.tail = null;
        }
        this.size--;
    }

    @Override
    public void reverse() {
        Node<T> prev = null;
        Node<T> act = this.head;
        Node next;

        while (act != null) {
            next = act.getNext();
            act.setNext(prev);
            prev = act;
            act = next;
        }
        this.head = prev;
    }

    @Override
    public void removeValue(T data) {
    //TODO Implement method removeValue
    }
}
