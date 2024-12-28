package com.example.Method.InstanceMethods;

public class ArgwithNoreturn {
    public void m1(String str,String rank) {
        System.out.println("Ravi is "+str+" class and "+rank);
    }
    public static void main(String[] args) {
        ArgwithNoreturn ref = new ArgwithNoreturn();
        ref.m1("ninth","First rank");

    }
}
