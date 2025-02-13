package com.example.ExceptionHandiling.CoustemException;
class InsufficentFunds extends  Exception{
    public InsufficentFunds(String message){
        super(message);
    }
}
class Bankaccount{
    private double Balance;

    public Bankaccount(double balance) {
        Balance = balance;
    }
    //deposit
    public void deposit(double amount){
       if (amount>0){
           Balance+=Balance;
           System.out.println("amount after deposit:"+getbalance());
       }else {
           System.out.println("amount should be greaterr than 0");
       }
    }
    //withdrawal
    public  void withdraw (double amount) throws InsufficentFunds{
        if(amount<Balance){
            Balance-=Balance;
        }else{
            throw new InsufficentFunds(+amount+" amount is lessthan Balance: "+getbalance());
        }
    }
    public double getbalance(){
        return  Balance;
    }
}
public class Exp2 {
    public static void main(String[] args) {
        Bankaccount bankaccount=new Bankaccount(100);
        bankaccount.deposit(100);
        try {
            bankaccount.withdraw(250);
        }catch (InsufficentFunds e){
            System.out.println(e.getMessage());
        }

    }
}
