package com.example.Constructers;

public class A {
    int i;
    int j;
    int k;
    A(){
    }
    A(int x){
        this.i=x;
    }
    A(int x,int y){
        this.i=x;
        this.j=y;
    }
    A(int x,int y,int z){
        this.i=x;
        this.j=y;
        this.k=z;
    }
    public int add(){
        return i+j+k;
    }


}
