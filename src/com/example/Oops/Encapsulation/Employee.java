package com.example.Oops.Encapsulation;

public class Employee {
    private int Id;
    private String empname;
    private double salary;

    public Employee(int id, String empname, double salary) {
        Id = id;
        this.empname = empname;
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", empname='" + empname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
