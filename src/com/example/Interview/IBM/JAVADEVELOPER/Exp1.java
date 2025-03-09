package com.example.Interview.IBM.JAVADEVELOPER;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exp1 {
    public static List<Integer> mergeArrays(List<Integer> a,List<Integer> b){
        List<Integer> result=new ArrayList<>();
        int i=0;
        int j=0;
        while (i<a.size()&&j<b.size()){
            if(a.get(i)<=b.get(j)){
                result.add(a.get(i++));
            }else {
                result.add(b.get(j++));
            }
        }
        while (i<a.size()){
            result.add(a.get(i++));
        }
        while (j<b.size()){
            result.add(b.get(j++));
        }
        return  result;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> a=new ArrayList<>();
        String [] altems=bufferedReader.readLine().split(" ");
        for(String item:altems){
            a.add(Integer.parseInt(item));
        }

        int m=Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> b=new ArrayList<>();
        String [] bltems=bufferedReader.readLine().split(" ");
        for(String item:bltems){
            b.add(Integer.parseInt(item));
        }

        List<Integer> mergedArray=mergeArrays(a,b);
        for(int num:mergedArray){
            System.out.print(num+"");
        }
        bufferedReader.close();;
    }
}
