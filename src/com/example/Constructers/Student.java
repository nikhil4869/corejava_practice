package com.example.Constructers;

public class Student {
    int i;
    int j;
    Student(){
        i=20;
        j=30;
    }
    public int add(){
        int res=i+j;
        return res;
    }
    public int sub(){
        int res=j-i;
        return res;
    }
    public int mul(){
        int res=i*j;
        return res;
    }

  /*  @Override
    public String toString() {
        return "Student{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }*/
}
