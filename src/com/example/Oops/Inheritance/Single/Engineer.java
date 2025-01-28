package com.example.Oops.Inheritance;

public class Engineer extends Employee {
    public Engineer(int id,String name,double salary){
        super(id, name, salary);
        System.out.println("Engineer Details");
        display();
    }
}
