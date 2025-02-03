package com.example.ExceptionHandiling.TryCatch;

public class Exp2 {
    public static void main(String[] args) {
        try {
            System.out.println("inside try");
            int i=0;
            int j=100;
            int k=j/i;
            System.out.println("inside try");//this line won't be printed because their is exception dirctly goes to catch
        }catch (Exception e){
            System.out.println("inside catch");
        }finally {
            System.out.println("inside final");
        }
    }
}
