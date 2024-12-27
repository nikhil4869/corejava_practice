package com.example.Operatars;

import com.sun.org.apache.xpath.internal.objects.XString;

public class TernaryOp {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int res=(x<y)?x:y;
        System.out.println(res);
        String str=(x>=y)?"ABC":"DEF";
        System.out.println(str);

        char ch=(x==y)?'x':'y';
        System.out.println(ch);



    }
}
