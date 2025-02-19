package com.example.Comparator;


public class Employee {
    private long Id;
    private String Name;
    private double Salary;
    private int Age;

    public Employee(long id, String name, double salary, int age) {
        Id = id;
        Name = name;
        Salary = salary;
        Age = age;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                ", Age=" + Age +
                '}';
    }
}