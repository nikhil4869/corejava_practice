package com.example.CondnStat;

public class Exp1 {
    public static void main(String[] args) {
        int mar=75;
        if(mar>90 && mar<90){
            System.out.println("Grade is : "+'A' );
        }else if(mar>80 && mar<90){
            System.out.println("Grade is : "+'B' );
        }else if(mar>70 && mar<80){
            System.out.println("Grade is : "+'C' );
        }else{
            System.out.println("just pass");
        }
    }
}
