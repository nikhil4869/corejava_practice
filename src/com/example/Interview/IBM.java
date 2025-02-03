package com.example.Interview;

import java.util.Scanner;

public class IBM {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Height of cylinder");
        double height=sc.nextDouble();
        System.out.println("Height of cylinder :"+height);

        System.out.println("Enter the radius of cylinder");
        double radius=sc.nextDouble();
        System.out.println("Radius of cylinder :"+radius);

        System.out.println("enter the coin radius");
        double coinRadius=sc.nextDouble();
        System.out.println("Radius of coin :"+coinRadius);

        double length=2*Math.PI*radius;
        System.out.println("length of rectangle :"+length);
        if (radius<=0 || coinRadius>radius || height<=0 || coinRadius<=0){
            System.out.println("data is invalid");
        }else {
            double c1=Math.floor((2*Math.PI*radius)/(2*coinRadius));
            double c2=Math.floor((height)/(2*coinRadius));
            System.out.println("Total coins that can fit in rectangle are :"+(int)(c1*c2));
        }
    }
}
