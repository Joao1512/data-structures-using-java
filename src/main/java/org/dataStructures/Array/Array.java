package org.dataStructures.Array;

public class Array<T>{

    private final Integer DEFAULT_CAPACITY = 16;

    private Integer size;
    public Integer capacity;

    private Object[] arr;

    public Array() {
        this.arr = new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
        this.size = 0;
    }

    public Integer size() {
        return this.size;
    }

    public Boolean isEmpty() {
        return this.size == 0;
    }

    public Object valueAt(Integer index) {
        if (index > this.size - 1) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        return this.arr[index];
    }

    public void push(T data) {
        this.arr[this.size] = data;
        this.size++;
        if (this.capacity / 2 <= this.size) {
            this.resize(this.capacity * 2);
        }
    }

    public void insert(Integer index, T data) {
        int start = index;
        int end = this.size;

        for (int i = end - 1; i >= start; i--) {
            this.arr[i + 1] = this.arr[i];
        }
        arr[index] = data;
        this.size++;
        if (this.capacity / 2 <= this.size) {
            this.resize(this.capacity * 2);
        }
    }

    public void pop() {
        this.arr[this.size - 1] = null;
        this.size--;

        if (this.capacity / 4 > this.size) {
            this.resize(this.size * 2);
        }
    }

    public void delete(Integer index) {
        int start = index;
        int end = this.size;

        for (int i = start; i < end; i++) {
            this.arr[i] = this.arr[i + 1];
            this.arr[i + 1] = null;
        }
        this.size--;
        if (this.capacity / 4 > this.size) {
            this.resize(this.size * 2);
        }
    }

    public void remove(T data) throws Exception {
        int indexToRemove = indexOf(data);
        delete(indexToRemove);
    }

    public int indexOf(T data) throws Exception {
        int count = 0;

        while (count < this.size) {
            if (arr[count].equals(data)) {
                return count;
            }
            count++;
        }
        throw new Exception("Not found!");
    }

    private void resize(Integer newCapacity) {
        this.capacity = newCapacity;
        Object[] oldArr = this.arr;
        this.arr = new Object[newCapacity];

        for (int i = 0; i < this.size; i++) {
            this.arr[i] = oldArr[i];
        }
        oldArr = null;
    }
}
