package com.example.Oops.Encapsulation;

public class Exp2 {
    public static void main(String[] args) {
        BankAccount Val=new BankAccount("nikhil",4869,10000d);
        System.out.println("Account Holder Name: "+ Val.getAccHolName());
        System.out.println("Acoount Id: "+Val.getAccountId());
        System.out.println("Intial Balance: "+Val.getBalance());
        Val.Dep(1000);
        System.out.println();
        System.out.println("after deposit");
        System.out.println(Val.getBalance());
        System.out.println();
        Val.WithDraw(10000);
        System.out.println("after withdraw");
        System.out.println(Val.getBalance());
    }
}
