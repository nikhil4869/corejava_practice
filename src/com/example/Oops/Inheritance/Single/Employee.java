package com.example.Oops.Inheritance;
//Super class or Parent class
public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Name of employeee :" +name);
        System.out.println("Employee Id :"+id);
        System.out.println("Employee salary :"+salary);
    }
}
