package com.example.HomeWork;

public class Exp2 {
    public static void main(String[] args) {
        int num =1234;
        int count=0;
        while(num!=0){
            int value=num%10;
            count=count+value;
            num=num/10;

        }
        System.out.println("Sum of the digit is "+count);

    }
}
