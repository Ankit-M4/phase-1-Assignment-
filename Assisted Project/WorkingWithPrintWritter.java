package com.test;

import java.io.*;

public class WorkingWithPrintWritter {
    public static void main(String[]args){
        try {
            PrintWriter out = new PrintWriter("newFile.txt");
            //Write data on file
            out.println("this is effotless");
            out.println("this is effotless to me ");
            out.flush();
            out.close();
            //gor reading effortlessly
            BufferedReader reader = new BufferedReader(new FileReader( new File(" new file.text")));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
    }
}}
