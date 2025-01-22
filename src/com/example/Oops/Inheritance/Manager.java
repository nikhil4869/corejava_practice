package com.example.Oops.Inheritance;

class Manager extends Employee {

    public Manager(int id, String name, double salary) {
        super(id, name, salary);
        System.out.println("Manager Details");
        display();
    }
}