package com.example.Oops.Abstraction;
abstract class Vehicle {
    protected String Name;
    protected int Num;

    public Vehicle(String name){
        this.Name=name;
        System.out.println("Vehicle name is "+Name);
    }
    public abstract String licence(String str);

    public int plate(int num){
        this.Num=num;
        return Num;
    }

}
class Bike extends Vehicle{

    public Bike(String name) {
        super(name);
    }

    @Override
    public String licence(String str) {
        return str;
    }

}
class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    @Override
    public String licence(String str) {
        return str;
    }

}
public class Main {
    public static void main(String[] args) {
        Vehicle ref=new Bike("Hunter 350");
        String Str=ref.licence("Approved");
        int Num=ref.plate(4869);
        System.out.println("Licence is "+Str);
        System.out.println("Number plate last Digits are "+Num);

        System.out.println();

        Vehicle ref1=new Bike("GTR");
        String Str1=ref1.licence(" Not Approved");
        int Num1=ref.plate(6800);
        System.out.println("Licence is "+Str1);
        System.out.println("Number plate last Digits are "+Num1);



    }
}
