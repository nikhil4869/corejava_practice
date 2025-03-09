package com.example.HomeWork;
//to print all starting letters capital
public class Exp9 {
    public static void main(String[] args) {
        String str="nikhil is going hyderabad";
        String fin="";
        String[] split=str.split(" ");
        for (String s:split){
            String sub="";
            for (int i=0;i<=s.length()-1;i++){
                if(i==0){
                    String sub2="";
                    String sub1=sub2+s.charAt(i);
                    sub+=sub1.toUpperCase();
                }else{
                    sub+=s.charAt(i);
                }
            }
            fin+=sub+" ";
        }
        System.out.println(fin.trim());
    }
}
