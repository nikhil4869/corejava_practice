package com.example.Strings;

public class StringBuff {
    public static void main(String[] args) {
        String s1=new String("abc");
        String s2=s1.concat(" software");
        String s3=s2.concat(" employee");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("------------");
        StringBuffer sb1=new StringBuffer("abc");
        StringBuffer sb2=sb1.append(" software");
        StringBuffer sb3=sb2.append(" empl");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        StringBuffer rev=sb3.reverse();
        System.out.println(rev);
        System.out.println();
        System.out.println("inserting data");
        StringBuffer res=sb3.insert(11,"nik");
        System.out.println(res);
        System.out.println();
        System.out.println("delete of data");
        StringBuffer result=sb3.delete(11,14);
        System.out.println(result);
        System.out.println();
        System.out.println("delete char at");
        StringBuffer res1=result.deleteCharAt(3);
        System.out.println(res1);
        System.out.println();
        System.out.println("repalce of data");
        StringBuffer res2=res1.replace(0,3,"data");
        System.out.println(res2);
    }
}
