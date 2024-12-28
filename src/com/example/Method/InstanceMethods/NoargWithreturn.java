package com.example.Method.InstanceMethods;

public class NoargWithreturn {
    public int m1(){
        int i=10;
        int j=20;
        return i+j;
    }
    public static void main(String[] args) {
        NoargWithreturn ref =new NoargWithreturn();
        int value =ref.m1();
        System.out.println(value);

    }
}
