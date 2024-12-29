package com.example.Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers={21,11,8,45,65,81,50,68,99};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int search=68;
        int result=BinarySearch.m1(numbers,search);
        if(result>=0){
            System.out.println("Index of " + search + " is " + result);
        }else {
            System.out.println("Seach word not in array..");
        }
    }
    public static int m1(int[] numbers,int search){
        int left=0;
        int right= numbers.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (numbers[mid]==search){
                return mid;
            } else if (numbers[mid]<search) {
                left=mid+1;

            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
