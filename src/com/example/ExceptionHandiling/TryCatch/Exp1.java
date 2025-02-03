package com.example.ExceptionHandiling.TryCatch;

public class Exp1 {
    public static void main(String[] args) {
        try {
            System.out.println("inside try");
        }catch (Exception e){
            System.out.println("inside catch");
        }finally {
            System.out.println("inside final");
        }
    }
}
