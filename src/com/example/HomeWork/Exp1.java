package com.example.HomeWork;

public class Exp1 {
    public static void main(String[] args) {
        String str="nikhil";
        String str1="";
        for (int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        System.out.println(str1);
    }
}
