package com.example.Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exp1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("ravi");
        list.add(1,"Ramesh");
        list.add(2,"Raju");
        list.add(3,"Roy");
        list.add("Ram");
        System.out.println(list);
        System.out.println();

        List<String> list1=new ArrayList<>();
        list1.add("Mahesh");
        list1.add("Mohan");
        list1.addAll(list);
        System.out.println(list1);
        System.out.println();

        list1.remove(3);
        System.out.println(list1);
        System.out.println();

        System.out.println(list1.get(5));
        System.out.println();

        list1.set(5,"Ramudu");
        System.out.println(list1);
        System.out.println();

        System.out.println(list1.contains("Ramudu"));
        System.out.println();

        System.out.println(list1.indexOf("ravi"));
        System.out.println();


        System.out.println("Before sorting "+list1);
        Collections.sort(list1);
        System.out.println("After sorting "+list1);
    }
}
