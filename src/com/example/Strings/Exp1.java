package com.example.Strings;

public class Exp1 {
    public static void main(String[] args) {
        //creating string by using new key word
        String str=new String();
        str ="name";
        //literal string--->creating using string key word
        String str1="nikhil";//1st method
        String str2="nikhil";
        String str3=new String("name");
        String str4=new String("name");
        System.out.println(str.equals(str3));
        System.out.println(str1.equals(str2));
        System.out.println();
        //they are stored at differeent locations although they are equal
        System.out.println(str==str2);
        System.out.println();
        //they are same thats the difference between this
        System.out.println(str1==str2);
        System.out.println(str3==str4);


    }
}
