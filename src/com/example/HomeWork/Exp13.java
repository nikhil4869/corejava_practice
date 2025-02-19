package com.example.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Exp13 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(6);
        list.add(8);
        list.add(-2);

        List<Integer> sum = new ArrayList<>();
        int k = 0;
        int L = 0;
        while (k<(list.size()-2)){
            sum.add(list.get(L)+list.get(L+1)+list.get(L+2));
            k++;
            L++;
        }
        System.out.println("Sum Values of subStrings of list: ");
        System.out.println(sum);
        for(int i=0;i<sum.size()-1;i++) {
            for (int j = i + 1; j <= sum.size() - 1; j++) {
                int a = sum.get(i);
                int b = sum.get(j);
                if (a < b) {
                    sum.set(i, b);
                    sum.set(j, a);
                }
            }
        }
        System.out.println();
        System.out.println("Max sum Value of SubString's is: "+sum.get(0));
    }
}
