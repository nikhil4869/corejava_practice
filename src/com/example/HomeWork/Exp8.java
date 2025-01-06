package com.example.HomeWork;

public class Exp8 {
    public static void main(String[] args) {
        String str="nikhil is a fresher";
        String fin="";
        String[] split=str.split(" ");
        for(String s:split){
            String sub1="";
            for(int i=s.length()-1;i>=0;i--){
                sub1+=s.charAt(i);
            }
            fin+=sub1+" ";
        }
        System.out.println(fin.trim());
    }
}
