package com.example.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Exp17 {
    public static void main(String[] args) {
        Map<Integer,Object> map=new HashMap<>();
        map.put(1,"nikhil");
        map.put(2,'A');
        map.put(3,false);
        map.put(4,100.55);
        map.put(5,20L);
        map.put(6,50d);
        for(Map.Entry<Integer,Object> entry: map.entrySet()){
            System.out.println(entry.getKey() +"==>"+entry.getValue().getClass().getSimpleName());
        }

    }
}
