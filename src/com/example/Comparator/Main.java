package com.example.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list= Arrays.asList(new Employee(106L,"Chandu",51000.00,32),
                new Employee(104L,"Nikhitha",90000.00,22),
                new Employee(103L,"Mahesh",95000.00,29),
                new Employee(105L,"Naresh",85000.00,30),
                new Employee(102L,"Alekhya",60000.00,18),
                new Employee(101L,"Nikhil",100000.00,22));
        System.out.println(list);
        System.out.println();
        System.out.println("To print Employee details according to Employee Id in Descending order");
        Collections.sort(list,new ComprartorId());
        System.out.println(list);
        System.out.println();
        System.out.println("To print Employee details according to Employee Name in Descending order");
        Collections.sort(list,new CompartorName());
        System.out.println(list);
        System.out.println();
        System.out.println("To print Employee details according to Employee Age in Descending order");
        Collections.sort(list,new ComparatorAge());
        System.out.println(list);
    }
}
