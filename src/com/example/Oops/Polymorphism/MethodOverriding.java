package com.example.Oops.Polymorphism;
class A{
    void main(){
        System.out.println("old funtionality");
    }
}
class B extends A{
    void main(){
        System.out.println("new funtionality");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a=new B();
        a.main();
    }
}
