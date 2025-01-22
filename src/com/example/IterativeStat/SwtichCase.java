package com.example.IterativeStat;

import java.util.Scanner;

public class SwtichCase {
    public static void main(String[] args) {
        int pin=4869;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your four digit pin number:");
        int ver = sc.nextInt();
        if(ver>9999 && ver<1000){
            System.out.println("Incorrect  pin");
        }else{
            switch (ver){
                case 4869:
                    System.out.println("Enter Amout to with draw");
                    break;
                default:
                    System.out.println("Incorrect pin");
            }
        }

    }
}
