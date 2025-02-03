package com.example.HomeWork;

import java.util.Scanner;


public class Exp10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String :");
        String str= sc.nextLine();
        if (check(str)){
            System.out.println("Given string is palindrom ");
        }else {
            System.out.println("Given String is not a palindrom");
        }
    }

    public static boolean check(String data) {
        String check=data.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left=0;
        int right=check.length();
        while(left<right){
            if (check.charAt(left) != check.charAt(right-1)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
