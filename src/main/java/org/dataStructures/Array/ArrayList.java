package org.dataStructures.Array;

public interface ArrayList<T> {
    public int size();
    public int capacity();
    public Boolean isEmpty();
    public T valueAt(Integer index);
    public void push(T data);
    public void insert(Integer index, T data);
    public T pop();
    public void delete(Integer index);
    public void remove(T data);
    public T indexOf(T data);
}
