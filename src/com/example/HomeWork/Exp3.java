package com.example.HomeWork;

public class Exp3 {
    public static void main(String[] args) {
        int num =12345;
        int count=0;
        while(num!=0){
            int value=num%10;
            count=(count*10)+value;
            num=num/10;

        }
        System.out.println("Reverse of the number is "+count);
    }
}
