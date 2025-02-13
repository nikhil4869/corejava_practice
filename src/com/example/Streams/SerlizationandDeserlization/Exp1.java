package com.example.Streams.SerlizationandDeserlization;

import java.io.*;

class Employee implements Serializable {
    private static final long serialversionUID=1L;
    private int EmpId;
    private String EmpName;
    private int Age;

    public Employee(int empId, String empName, int age) {
        EmpId = empId;
        EmpName = empName;
        Age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", Age=" + Age +
                '}';
    }
}
public class Exp1 {
    public static void main(String[] args) throws IOException {
        Employee employee=new Employee(4869,"Nikhil",22);
        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("D:\\study\\Practice\\serlization.ser"))){
            os.writeObject(employee);
            System.out.println("Serialization is complete");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Deserialization
        try(ObjectInputStream os1=new ObjectInputStream(new FileInputStream("D:\\study\\Practice\\serlization.ser"))) {
            Employee employee1=(Employee) os1.readObject();
            System.out.println("Deserialization Complete"+employee1);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
