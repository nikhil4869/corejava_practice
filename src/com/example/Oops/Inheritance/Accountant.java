package com.example.Oops.Inheritance;

public class Accountant extends Employee{

    public Accountant(int id, String nmae, double salary) {
        super(id, nmae, salary);
        System.out.println("Accountant details");
        display();
    }
}
