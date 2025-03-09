package com.example.Collection.List;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Exp2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();//Arraylist is better for sorting and accesing data.
        list.add(10);
        list.add(4);
        list.add(5);
        list.add(81);
        list.add(56);
        list.add(56);
        System.out.println(list);//Array list follows insertion order and also allows duplicates.
        System.out.println();

        HashSet<Integer> hashSet=new HashSet<>(list);//does not follow instersion order and no duplicates.
        System.out.println(hashSet);
    }
}
