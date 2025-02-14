package com.example.Cursors.Listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exp1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Nikhil");
        list.add("ravi");
        list.add("raju");
        list.add("vasu");
        list.add("niki");
        ListIterator<String> listIterator=list.listIterator();

        listIterator.add("vamshi");
       // listIterator=list.listIterator();
        listIterator.previous();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println();
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());

        }
        System.out.println(list);


    }
}
