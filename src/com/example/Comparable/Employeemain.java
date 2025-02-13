package com.example.Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Employeemain {
    public static void main(String[] args) {
        List<Employee> list= Arrays.asList(new Employee(106L,"Chandu",51000.00,32),
                new Employee(104L,"Nikhitha",90000.00,22),
                new Employee(103L,"Mahesh",95000.00,29),
                new Employee(105L,"Naresh",85000.00,30),
                new Employee(102L,"Alekhya",60000.00,18),
                new Employee(101L,"Nikhil",100000.00,22));
        System.out.println(list);
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
    }
}
