package com.example.Constructers;

public class Exp2 {
    public static void main(String[] args) {
        Employee employee =new Employee(4869,"Nikhil",10000);
        System.out.println(employee);


        System.out.println("Copy constucter");
        Employee m1=new Employee(employee);
        System.out.println(m1);

    }
}
