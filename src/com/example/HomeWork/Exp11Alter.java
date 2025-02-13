package com.example.HomeWork;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Exp11Alter {
    public static void main(String[] args) {
        List<Employee11s> list=new ArrayList<>();
        Employee11s employee1=new Employee11s(101,"Nikhil","Kurnool",90001.00);
        Employee11s employee2=new Employee11s(102,"Nikhitha","Bangalore",95000.00);
        Employee11s employee3=new Employee11s(103,"Nithin","Nizambad",55000.00);
        Employee11s employee4=new Employee11s(104,"Naveen","Nandyala",85000.00);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        //Details of employee greater than 90k and lives in bangalore
        for(Employee11s emp:list){
            if(emp.getSalary()>90000&&emp.getCity().equalsIgnoreCase("bangalore")){
                System.out.println(emp);
            }
        }
        System.out.println();

        //Details of employee who's id is even and salary greater than 50k
        for(Employee11s emp:list){
            if(emp.getSalary()>50000&&(emp.getId()%2)==0){
                System.out.println(emp);
            }
        }

    }
}
