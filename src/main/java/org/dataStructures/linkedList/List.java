package org.dataStructures.linkedList;

public interface List<T> {
    public Integer size();
    public Boolean empty();
    public T valueAt(Integer index);
    public void pushFront(T data);
    public void pushBack(T data);
    public void popFront();
    public void popBack();
    public T front();
    public T back();
    public void set(T data, Integer index);
    public void erase(Integer index);
    public void reverse();
    public void removeValue(T data);
}
