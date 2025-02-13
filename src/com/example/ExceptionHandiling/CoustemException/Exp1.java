package com.example.ExceptionHandiling.CoustemException;
class Invalid extends Exception {
    public Invalid (String message){
        super(message);
    }
}
public class Exp1 {
    public static void agefor(int age) throws Invalid {
        if (age<18){
            throw new Invalid("Age is less than 18");
        }else{
            System.out.println("age is above 18");
        }
    }
    public static void main(String[] args) {
        try {
            agefor(14);
        }catch (Invalid ex){
            System.out.println(ex.getMessage());
        }

    }
}
