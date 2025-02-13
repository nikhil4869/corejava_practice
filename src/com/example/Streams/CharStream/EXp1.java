package com.example.Streams.CharStream;

import java.io.*;

public class EXp1 {
    public static void main(String[] args) {
        //write a file
        try(Writer writer=new FileWriter("D:\\study\\Practice\\StreamExp1.txt")) {
            writer.write("hi....This is char Stream .");
            writer.write("Lets work hard .");
            writer.write("Data is continued in same line .No Method in this to Write in next line .");
            System.out.println("Data added success fully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //To read the data
        try(Reader read=new FileReader("D:\\study\\Practice\\StreamExp1.txt")){
            BufferedReader bufferedReader=new BufferedReader(read);
            String line;
            while ((line= bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
