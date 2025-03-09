package com.example.Cursors.Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exp1 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(101);
        set.add(13);
        set.add(40);
        set.add(450);
        set.add(4756);
        Iterator<Integer> spam=set.iterator();
        while (spam.hasNext()){
            int num=spam.next();
            if(num==450){
                spam.remove();
            }
            System.out.println(num);
        }
        System.out.println(set);
        System.out.println();



    }
}
