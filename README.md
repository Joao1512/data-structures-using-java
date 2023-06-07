# Data Structures in Java

This repository contains implementations of data structures using the Java programming language. Each data structure is implemented in a separate file.

I've created this repository to document and share with the community everything know about data structures.

## 📌 Array

Mutable array with automatic resizing.

- [x]  **size**() - number of items.
- [x]  isEmpty()
- [x]  valueAt(index) - returns the value of the nth item (starting at 0 for first)
- [x]  push(data) - inserts at tail (end of array).
- [x]  insert(index, data) - inserts item at index, shifts that index's value and trailing elements to the right
- [x]  pop() - removes value at the tail.
- [x]  delete(index) - delete item at index, shifting all trailing elements left.
- [x]  remove(data) - looks for value and removes first occurrence of it.
- [x]  indexOf(data) - looks for value and returns index of first occurence of it.
- [x]  resize(newSize) - when you reach half of capacity, resize to double the size.  when popping an item, if size is < 1/4 of capacity, resize to half.

## 📌 LinkedList

- [x]  **size**() - number of items.
- [x]  **isEmpty**()
- [x]  **valueAt**(index) - returns the value of the nth item (starting at 0 for first)
- [x]  **pushFront**(value) - adds an item to the front of the list.
- [x]  **pushBack**(value) - adds an item at the end.
- [x]  **popFront**() - remove front item and return its value.
- [x]  **popBack**() - removes end item and returns its value
- [x]  **front**() - get value of front item.
- [x]  **back**() - get value of end item.
- [x]  **set**(index, value) - insert value at index, so current item at that index is pointed to by new item at index.
- [x]  **erase**(index) - removes the item in index.
- [x]  **reverse**()

## 📌 Queue

Implementing using linked-list, with tail pointer:

- [ ]  **enqueue**(value) - adds value at position at tail.
- [ ]  **dequeue**() - returns value and removes least recently added element (front).
- [ ]  **clear**() - removes all items.
- [ ]  **size**() - number of items.
- [ ]  **print**() - prints all items.
- [ ]  **indexOf**(item) - get the index of first occurrence of item.

## 📌 Sorting

- [ ]  **quickSort**()
- [ ]  **selectionSort**()

## 📌 Search

- [ ]  **binarySearh** - recursive and iterative.

## 📌 Graphs

- [x]  Breadth-First Search
- [x]  Dijkstra’s Algorithm

## 📌 Hash Table

Currenctly working on implementation of a hash table and preparing some problems solutions to commit...

## 🗒️ Contribution:

This repository is a work in progress, and I will post more lines of code over time with more data structures and improvements to existing ones.

Contributions are welcome! If you want to implement additional array functions, fix bugs, or improve the existing implementation, feel free to submit a pull request.

## ⚖ License:

This project is licensed under the **[MIT License](https://github.com/Joao1512/data-structures-using-java/blob/master/LICENSE)**. Refer to the LICENSE file for more information.
