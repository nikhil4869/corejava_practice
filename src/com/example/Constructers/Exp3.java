package com.example.Constructers;

public class Exp3 {
    public static void main(String[] args) {
        A a1 =new A(10);
        int res= a1.add();
        A a2 =new A(20,30);
        int res1= a2.add();
        A a3 =new A(20,30,40);
        int res2= a3.add();
        System.out.println("stage 1");
        System.out.println(res);
        System.out.println("stage 2");
        System.out.println(res1);
        System.out.println("stage 3");
        System.out.println(res2);
    }
}
