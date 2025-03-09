package com.example.Collection.Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(10,"Nikhil");
        map.put(20,"Nithin");
        map.put(30,"Baba");
        System.out.println(map);
        System.out.println();
        //To Get Value
        System.out.println(map.get(30));
        System.out.println();
        //To Replace data
        System.out.println(map.replace(20,"Niki"));
        System.out.println();
        //To Remove Data
        System.out.println(map.remove(30));
        System.out.println();
        //To Get all Keys in Map
        Set<Integer> set=map.keySet();
        System.out.println(set);
        System.out.println();
        //To Get all Values in Map
        Collection<String> values=map.values();
        System.out.println(values);
        //To Print all Keys and Values using entryset
        Set<Map.Entry<Integer,String>> entry =map.entrySet();
        Iterator<Map.Entry<Integer,String>> list=entry.iterator();
        while (list.hasNext()){
            Map.Entry<Integer,String> next=list.next();
            System.out.println("Key="+next.getKey()+"-->Value="+next.getValue());
        }
        System.out.println();
        //To Check if map is empty
        System.out.println(map.isEmpty());

    }
}
