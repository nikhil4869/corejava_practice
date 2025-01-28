package com.example.Oops.Polymorphism;

class math{
    void add(int a,int b,int c,int d){
        System.out.println("Sum of integer numbers :"+(a+b+c+d));
    }
    void add(float a,double b,int c,int d){
        System.out.println("Sum of numbers :"+(a+b+c+d));
    }
    void add(int a,int b){
        System.out.println("sum of numbers :"+(a+b));
    }

}
public class MethodOverloading {
    public static void main(String[] args) {
        math val=new math();
        val.add(10,20);
        val.add(10,20,30,40);
        val.add(10f,20d,30,70);
    }
}
