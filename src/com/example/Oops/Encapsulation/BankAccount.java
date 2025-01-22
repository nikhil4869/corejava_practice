package com.example.Oops.Encapsulation;

public class BankAccount {

    private String AccHolName;
    private int AccountId;
    private double Balance;

    public BankAccount(String accHolName, int accountId, double balance) {
        AccHolName = accHolName;
        AccountId = accountId;
        Balance = balance;
    }

    public String getAccHolName() {
        return AccHolName;
    }

    public int getAccountId() {
        return AccountId;
    }

    public double getBalance() {
        return Balance;
    }
    // Method to deposit money
    public void Dep(double amount){
        if(amount>0){
            Balance+=amount;
        }else {
            System.out.println("invalid ammount value");
        }
    }
    //amount to with draw
    public void WithDraw(double amount){
       if (amount>0){
           if (amount<=Balance){
               Balance-=amount;
           }else {
               System.out.println("invalid funds");
           }

       }

    }
}
