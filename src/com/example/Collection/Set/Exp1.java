package com.example.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exp1 {
    public static void main(String[] args) {
        //Any Set Does not allow duplicates
        Set<Integer> set=new HashSet<>();//set does not follow insertion order.
        set.add(10);
        set.add(50);
        set.add(12);
        set.add(65);
        set.add(567);
        set.add(10);
        System.out.println(set);
        System.out.println();

        Set<Integer> set1=new LinkedHashSet<>();//But linkedhashset follows insertion order.
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(99);
        set1.add(58);
        set1.add(12);
        set1.add(10);
        System.out.println(set1);
        System.out.println();

        Set<Integer> set2=new TreeSet<>();//Treeset follows sorting order.
        set2.add(10);
        set2.add(67);
        set2.add(23);
        set2.add(45);
        set2.add(4);
        set2.add(10);
        System.out.println(set2);
    }
}
