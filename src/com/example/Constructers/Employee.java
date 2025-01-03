package com.example.Constructers;

public class Employee {
    int id;
    String name;
    double salary;
    //parameterlized constructor
    Employee(int ids,String names,double salarys){
        this.id=ids;
        this.name=names;
        this.salary=salarys;

    }
    //copy constructer
    Employee(Employee employee){
        this.id=employee.id;
        this.name=employee.name;
        this.salary=employee.salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String tostring(){
        return "Employee id "+id+" name is" +name+" and salary"+salary;

    }
}
