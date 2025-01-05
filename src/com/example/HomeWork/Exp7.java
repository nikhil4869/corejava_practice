package com.example.HomeWork;

import java.util.Scanner;

public class Exp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your four digit pin number:");
        int num = sc.nextInt();
        int fac=1;
        while(num!=0){
            fac=num*fac;
            num-=1;
        }
        System.out.println("Factorial of given number is: "+fac);
    }
}
