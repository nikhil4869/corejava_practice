package com.example.Oops.Abstraction;

abstract class C {
    abstract void m1();

    abstract void m2();

    void m3(){
        System.out.println("Method m3 ........");
    }
}
class B extends C{

    @Override
    void m1() {
        System.out.println("Method m1 ........");
    }

    @Override
    void m2() {
        System.out.println("Method m2 ........");

    }
}
public class A {
    public static void main(String[] args) {
        C ref = new B();
        ref.m1();
        ref.m2();
        ref.m3();
        System.out.println();
        //the other way to call methods
        B ref1=new B();
        ref1.m1();
        ref1.m2();
        ref1.m3();

    }
}
