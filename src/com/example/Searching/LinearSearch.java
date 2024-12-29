package com.example.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers ={10,20,30,40};
        int search =30;
        int result=LinearSearch.m1( numbers,search);
        if(result>=0) {
            System.out.println("Index of " + search + " is " + result);
        }else{
            System.out.println("Given number is not in the array...");
        }

    }
    public static int m1(int[] numbers,int search){
        for (int i=0;i< numbers.length;i++){
            if (numbers[i]==search){
                return i;
            }
        }
        return -1;
}
}
