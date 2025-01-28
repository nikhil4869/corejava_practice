package com.example.Oops.Inheritance;

 class BankAccounts {
    String name;
    double Balance;
    int Count;
    int Charges=20;

     BankAccounts(String name, double balance) {
        this.name = name;
        Balance = balance;
    }
    void deposit(double amount){
        Balance+=amount;
        System.out.println("Balance after deposit is :"+Balance);
    }
    void Withdraw(double amount){
         Count+=1;
         if(Count<=3){
             if (amount<=Balance){
                 Balance-=amount;
                 System.out.println("Balance after Withdraw :"+Balance);

             }else {
                 System.out.println("Insufficent funds");
             }
         }else {
             if (amount<=Balance+Charges){
                 Balance-=amount+Charges;
                 System.out.println("Balance after Withdraw is :"+Balance+" With Charges :"+Charges);

             }else {
                 System.out.println("Insufficent funds");
             }

         }
    }
}
class SavingAccount extends BankAccounts {
    double IntrestRate;

    public SavingAccount(String name, double balance,double intrestrate) {
        super(name, balance);
        this.IntrestRate=intrestrate;
        System.out.println();
        System.out.println("Name of the Account holder is : "+name);
        System.out.println("Intial balance is :"+balance);
    }
    void applyintrest(){
        double intrest=Balance*(IntrestRate/100);
        Balance+=intrest;
        System.out.println("Your intrest rate is :"+intrest+" Toatal Balance is : "+Balance);

    }
}
class CheckingAccount extends BankAccounts {
     double Overdraftlimit;

    CheckingAccount(String name, double balance,double overdraftlimit) {
        super(name, balance);
        this.Overdraftlimit=overdraftlimit;
        System.out.println();
        System.out.println("Name of the Account holder is : "+name);
        System.out.println("Intial balance is :"+balance);
    }
    void Limit(){
        System.out.println("overdraft limit is :"+Overdraftlimit);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        CheckingAccount ch=new CheckingAccount("Nikhil",10000d,1000d);
        ch.deposit(10000);
        ch.Withdraw(5000);
        ch.Limit();
        SavingAccount sa=new SavingAccount("Nithin",100000d,10);
        sa.deposit(1000d);
        sa.Withdraw(10000d);
        sa.applyintrest();
    }
}
