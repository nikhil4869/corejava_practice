package com.example.HomeWork;

import java.util.ArrayList;
import java.util.List;

//To find min number in a array
public class Exp15 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(1);
        list.add(3);
        System.out.println("Before Sorting");
        System.out.println(list);
        //lets Sort
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if (list.get(i)>list.get(j)){
                    int temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println("After Sorting");
        System.out.println(list);
        //To get Min number in Array
        System.out.println("Min number in array:"+list.get(0));
    }
}
