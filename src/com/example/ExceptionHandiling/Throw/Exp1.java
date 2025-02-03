package com.example.ExceptionHandiling.Throw;

class  Student{
    int ID;
    String Name;
    int Marks;

    public Student(int iD, String name, int marks) {
        this.ID = iD;
        Name = name;
        Marks = marks;
    }
    public void result(){
        System.out.println("Student id :"+ID);
        System.out.println("Student name :"+Name);
        System.out.println("Student marks :"+Marks);
        if (Marks<35){
            System.out.println("Fail");
        } else if (Marks<=50) {
            System.out.println("D");
        } else if (Marks<=70) {
            System.out.println("C");
        } else if (Marks <=80) {
            System.out.println("B");
        }else if (Marks <=90) {
            System.out.println("A");
        }else if (Marks <=100) {
            System.out.println("O");
        }else {
            throw new RuntimeException("Invalid Marks");
        }
    }
}
public class Exp1 {
    public static void main(String[] args) {
        Student Marks=new Student(4869,"nikhil",75);
        Marks.result();
        System.out.println();
        Student Mark=new Student(6800,"s.nikhil",101);
        Mark.result();


    }
}
