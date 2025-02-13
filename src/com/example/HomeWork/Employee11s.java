package com.example.HomeWork;

import java.security.PrivateKey;

public class Employee11s {
    private int  Id;
    private String Name;
    private String City;
    private double Salary;

    public Employee11s(int id, String name, String city, double salary) {
        Id = id;
        Name = name;
        City = city;
        Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee11{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", City='" + City + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
