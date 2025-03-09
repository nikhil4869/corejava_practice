package com.example.Interview.IBM.JAVADEVELOPER;

import java.util.Scanner;

public class Exp2 {
    public static String findMinLexString(String s, int k) {
        char[] t = s.toCharArray();
        int n = t.length;

        for (int i = 0; i < n; i++) {
            if (k == 0) break;

            char original = t[i];

            if (Character.isLetter(original)) {
                char minChar = original;
                int minDistance = 0;
                char startChar = Character.isUpperCase(original) ? 'A' : 'a';

                for (char c = startChar; c < original; c++) {
                    int distance = original - c;
                    if (distance <= k) {
                        minChar = c;
                        minDistance = distance;
                        break;
                    }
                }

                t[i] = minChar;
                k -= minDistance;
            }
        }

        return new String(t);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(findMinLexString(s, k));
    }
}