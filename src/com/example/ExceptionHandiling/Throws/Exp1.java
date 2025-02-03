package com.example.ExceptionHandiling.Throws;

import java.io.IOException;

class A{
    void  add() throws  Exception{
        concat();
    }
    void concat() throws IOException {
        throw new RuntimeException("IO Exception");
    }
}
public class Exp1 {
    public static void main(String[] args) throws Exception {
        A b=new A();
        b.add();

    }
}
