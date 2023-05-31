package org.dataStructures;

import org.dataStructures.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.pushBack(21);
        list.pushBack(22);
        list.pushBack(23);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.valueAt(i));
        }
    }
}