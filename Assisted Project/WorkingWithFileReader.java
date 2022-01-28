package com.test;

import java.io.*;

public class WorkingWithFileReader {
    public static void main(String[] args) throws IOException {
        String str1 = "How are you";

        File theFile = new File("we cant");
        FileWriter Writer = new FileWriter(theFile);
        Writer.write("Hellow bhai");
        Writer.flush();
        Writer.close();
        System.out.println(theFile.getName());
        FileReader reader = new FileReader(theFile);
        char[] inputFromUser = new char[100];
        reader.read(inputFromUser);
        System.out.println();
        appendStrToFile(theFile,str1);

    }

    // TO append string into a file
    public static void appendStrToFile(File fileName, String str) {

        try {


            // Open given file in append mode by creating an
            // object of BufferedWriter class
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName));

            // Writing on. file
            out.write("Hello World:\n");

            // Closing file connections
            out.close();
        }

        // Catch block to handle the exceptions
        catch (IOException e) {

            // Display message when exception occurs
            System.out.println("exception occurred" + e);
        }
    }
}


