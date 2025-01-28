package com.example.Interview;

import java.util.*;
//to check the arr with particular sequence.
public class Main {
    public static int longestArithmeticSubsequence(int[] arr) {
        int n = arr.length;
        if (n <= 1) return n;

        HashMap<Integer, Integer>[] dp = new HashMap[n];
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                int diff = arr[i] - arr[j];
                int currentLength = dp[j].getOrDefault(diff, 1) + 1;
                dp[i].put(diff, currentLength);
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(longestArithmeticSubsequence(arr));
        scanner.close();
    }
}