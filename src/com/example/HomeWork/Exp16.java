package com.example.HomeWork;

import java.util.ArrayList;
import java.util.List;

//To find repeated Strings in array by ignoring Case
public class Exp16 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("CAT");
        list.add("dog");
        list.add("caT");
        list.add("DOg");
        list.add("Elephant");
        System.out.println(list);
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                String str=list.get(j);
                if (str.equalsIgnoreCase(list.get(i))){
                    System.out.println("Repeated Strings are  "+str);
                }
            }
        }
    }
}
