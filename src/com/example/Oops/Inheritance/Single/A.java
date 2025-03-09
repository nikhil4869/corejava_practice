package com.example.Oops.Inheritance.Single;

class C {
    public void add(int i, int j) {
        System.out.println("Sum of two integers"+(i+j));

    }
}
class B extends C {
    public void sum(int a,int b){
        super.add(a,b);
    }

}
public class A {
    public static void main(String[] args) {
        B ref=new B();
        ref.sum(10,20);
    }
}
