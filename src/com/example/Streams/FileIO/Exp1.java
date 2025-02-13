package com.example.Streams.FileIO;

import java.io.*;

public class Exp1 {
    public static void main(String[] args) throws IOException {
        //to write a data in a file
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("D:\\study\\Practice\\FileIOmExp1.txt"))){
            bufferedWriter.write("Writing data in a file using File IO ");
            bufferedWriter.newLine();
            bufferedWriter.write("By using only Writer and Reader we cannot write data in a new line . ");
            bufferedWriter.newLine();
            bufferedWriter.write("This is the difference between (Writer and Reader) and FileWriter and Reader .");
        }catch (IOException e){
            e.printStackTrace();;
        }
        //To read a file
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\study\\Practice\\FileIOmExp1.txt"))){
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }
    }
}
