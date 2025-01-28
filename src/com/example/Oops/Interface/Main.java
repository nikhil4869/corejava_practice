package com.example.Oops.Inheritance;
interface A{
    int i=100;
    void m1();
    void m2();

}
class B implements A{

    @Override
    public void m1() {
        System.out.println("m1 methods is done");
    }

    @Override
    public void m2() {
        System.out.println("m2 method is done");
    }
    void m3(){
        System.out.println("m3 is done");
    }
}
public class Main {
    public static void main(String[] args) {
        A a=new B();
        System.out.println(a.i);
        a.m1();
        a.m2();
        System.out.println();
        B b=new B();//we cant call m3 with A ref, so we used B as reference
        b.m1();
        b.m2();
        b.m3();
        System.out.println(b.i);
    }
}
