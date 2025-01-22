package com.example.Strings;

public class Exp2 {
    public static void main(String[] args) {
        //strings methods
        String str="nikhil";
        System.out.println(str.length());
        int[] i={1,2,3,4,5};
        System.out.println(i.length);
        System.out.println();
        //equalIgnorecase
        String str1="NIKHIL";
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println();
        //toUpprecase and toLowercase
        System.out.println(str.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println();
        //startsWith and endsWith
        System.out.println(str.startsWith("n"));
        System.out.println(str.startsWith("N"));
        System.out.println(str.endsWith("l"));
        System.out.println(str.endsWith("L"));
        System.out.println();
        //charAt ----> to find char ina string at particular index
        System.out.println(str.charAt(3));
        System.out.println();
        //replace ---> to replace onechar from a string(it does not change original string)
        System.out.println(str.replace("n","p"));
        System.out.println();
        //replaceFirst
        String str2="Bonthala nikhil";
        String str3="Siripi nikhil";
        System.out.println(str2.replaceFirst("Bonthala","Siripi"));
        System.out.println();
        //indexof and lastindexof
        System.out.println(str2.indexOf("a"));
        System.out.println(str2.lastIndexOf("i"));
        System.out.println();
        //substring
        System.out.println(str2.substring(3));
        System.out.println(str2.substring(3,8));
        System.out.println();
        //String [] split
        String str4="nikhil is a good boy";
        String[] split=str4.split(" ");
        for(String s : split ){
            System.out.println(s);

        }
        System.out.println();
        char[] charArray =str4.toCharArray();
        for (char ch:charArray){
            System.out.println(ch);
        }
        System.out.println();
        //trim
        String str5="   nikhil ";
        System.out.println(str5);
        System.out.println(str5.trim());
        System.out.println();
        //compareTo and comapareToignarecase
        String str6="abc";
        String str7="def";
        String str8="abc";
        String str9="ABC";
        System.out.println(str6.compareTo(str7));
        System.out.println(str7.compareTo(str6));
        System.out.println(str6.compareTo(str8));
        System.out.println(str6.compareToIgnoreCase(str9));
        System.out.println();
        //concat
        String str10=str1.concat(str2);
        String str11=str10.concat(str9);
        System.out.println(str10);;
        System.out.println(str11);

    }
}
