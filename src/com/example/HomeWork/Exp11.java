package com.example.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee{
    private int Id;
    private String Name;
    private double Salary;
    private String City;

    public Employee(int id, String name, double salary,String city ) {
        this.Id = id;
        this.Name = name;
        this.Salary = salary;
        this.City=city;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }

    public String getCity() {
        return City;
    }
}
public class Exp11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Employee> emp=new ArrayList<>();
        System.out.println("Enter number of employees: " );
        int num=sc.nextInt();

        for (int i=0;i<num;i++){
            System.out.println("Enter Employee "+(i+1)+" details");
            System.out.println("Employee Id");
            int idnum=sc.nextInt();
            sc.nextLine();
            System.out.println("Employee Name");
            String Name=sc.nextLine();
            System.out.println("Enter Salary");
            double sal=sc.nextDouble();
            sc.nextLine();
            System.out.println("enter city");
            String namecity=sc.nextLine();
            emp.add(new Employee(idnum,Name,sal,namecity));
        }
        System.out.println();
        System.out.println("ALL EMPLOYEES AND THERE DETAILS");
        for(Employee data:emp){
            System.out.println("ID "+data.getId()+" Name "+ data.getName()+" Salary "+ data.getSalary()+" City "+ data.getCity());
        }

        int count=0;
        System.out.println("Employee Names those who live in Bangalore and has salary Greater than 89999");
        for(Employee emplist:emp){
            if(emplist.getCity().equalsIgnoreCase("Bangalore")&&emplist.getSalary()>89999){
                System.out.println(emplist.getName());
                count++;
            }
        }

        if (count==0){
            System.out.println("No one is Present");
        }else {
            System.out.println("Total Count "+count);
        }
        System.out.println();

        System.out.println("Employees Names whose id is even and Salary greater than 49999");
        int max=0;
        for (Employee emplist:emp) {
            if ((emplist.getId()%2)==0&&emplist.getSalary()>49999){
                System.out.println(emplist.getName());
                max++;
            }
        }

        if (max==0){
            System.out.println("No one is Present");
        }else {
            System.out.println("Total Count "+max);
        }

        sc.close();
    }
}

