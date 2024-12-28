package com.example.methods;

public class WithargWithreturn {
    public static int m1(int i,int j){
        return i+j;
    }
    public static void main(String[] args) {
        int sum=WithargWithreturn.m1(100,300);
        System.out.println(sum);
    }
}
