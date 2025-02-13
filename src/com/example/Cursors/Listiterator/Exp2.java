package com.example.Cursors.Listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exp2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Nikhil");
        list.add("ravi");
        list.add("raju");
        list.add("vasu");
        list.add("niki");

        ListIterator<String> listIterator=list.listIterator();
        while(listIterator.hasNext()){
            if(listIterator.next()=="Nikhil"){
                listIterator.set("chandu");
            }
        }
        System.out.println(list);
        System.out.println();

        while(listIterator.hasPrevious()) {
            if (listIterator.previous() == "niki"){
                listIterator.set("nikitha");
            }
        }
        System.out.println(list);
        System.out.println();

        while(listIterator.hasNext()){
            if(listIterator.next()=="chandu"){
                listIterator.remove();
            }
        }
        System.out.println(list);
        System.out.println();

        while(listIterator.hasPrevious()) {
            if (listIterator.previous() == "nikitha"){
                listIterator.remove();
            }
        }
        System.out.println(list);


    }
}
