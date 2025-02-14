package com.example.HomeWork;

import java.util.ArrayList;

public class Exp12 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println("List Before Sorting");
        System.out.println(list);
//        for(int i=0;i<list.stream().count()-1;i++){
//            for (int j=i+1;j<=list.stream().count()-1;j++){
//                int a=list.get(i);
//                int b=list.get(j);
//                if(a<b){
//                    list.set(i,b);
//                    list.set(j,a);
//                }
//            }
//        }
        int count=0;
        for(int i=0;i<list.stream().count();i++){
            if(list.get(i)==1){
                list.remove(i);
                count++;
            }
        }
        int k=0;
        while(k<count){
            list.add(1);
            k++;
        }
        System.out.println();
        System.out.println("List After Sorting");
        System.out.println(list);

    }
}
