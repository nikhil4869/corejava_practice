package com.example.Collection.List;

import java.util.LinkedList;
import java.util.List;

public class Exp3 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();//Linked list is good for adding and deleting data.
        list.add(10);
        list.add(11);
        list.add(56);
        list.add(567);
        list.add(1013);
        list.add(10);
        System.out.println(list);
        list.remove(3);
        list.removeLast();
        System.out.println();
        System.out.println(list);
    }
}
