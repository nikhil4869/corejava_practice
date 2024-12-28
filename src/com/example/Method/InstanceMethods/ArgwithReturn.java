package com.example.Method.InstanceMethods;

public class ArgwithReturn {
    public int m1(int i,int j){
        return i+j;
    }
    public static void main(String[] args) {
        ArgwithReturn ref =new ArgwithReturn();
        int sum =ref.m1(100,200);
        System.out.println(sum);
    }
}
