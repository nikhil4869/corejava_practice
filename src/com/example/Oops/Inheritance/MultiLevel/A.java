package com.example.Oops.Inheritance.MultiLevel;

public class A {
    int a;
    public A(int a) {
        this.a = a;
    }
    public int add(){
        return a;
    }
}
class B extends A {
    int b;
    public B(int a,int b) {
        super(a);
        this.b=b;
    }
    public int addb() {
        return add() +b;
    }
}
class C extends B {
    int c;
    public C(int a,int b,int c) {
        super(a,b);
        this.c=c;
    }
    public int addc() {
        return addb() +c;
    }

}
