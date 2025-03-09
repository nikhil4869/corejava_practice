package com.example.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exp14 {
    public static void main(String[] args) {
        String str="JavaProgramming";
        System.out.println("String is:"+str);
        String str1=str.replace(" ","");
        char[] ch=str1.toCharArray();

        Map<Character,Integer> map=new HashMap<>();
        for(char res:ch){
            int def=map.getOrDefault(res,0)+1;
            map.put(res,def);
        }
        System.out.println(map);
        System.out.println();

        Map<String,Integer> map1=new HashMap<>();
        String str2="Nikhil is going to hyderabad and he is going with his friends";
        String[] split=str2.split(" ");
        for(String res1:split){
            int def1=map1.getOrDefault(res1,0)+1;
            map1.put(res1,def1);
        }
        System.out.println(map1);
    }
}
