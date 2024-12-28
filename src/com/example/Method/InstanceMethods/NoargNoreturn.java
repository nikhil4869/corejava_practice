package com.example.Method.InstanceMethods;

public class NoargNoreturn {
    public void m1(){
        System.out.println("Method with no arguments and no return type");
    }
    public static void main(String[] args) {
        NoargNoreturn ref=new NoargNoreturn();
        ref.m1();

    }
}
