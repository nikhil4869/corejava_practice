package com.example.Interview.IBM.FullStack;

import java.util.HashMap;
import java.util.Map;

public class Exp1 {
        public static String dnaComplement(String s) {
            Map<Character, Character> complementMap = new HashMap<>();
            complementMap.put('A', 'T');
            complementMap.put('T', 'A');
            complementMap.put('C', 'G');
            complementMap.put('G', 'C');

            StringBuilder reversedComplement = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                reversedComplement.append(complementMap.get(s.charAt(i)));
            }
            return reversedComplement.toString();
        }

        public static void main(String[] args) {
            String input = "ACCGGGTTTT";
            System.out.println(dnaComplement(input));
        }
}
