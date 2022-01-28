package com.test;
import java.io.*;

public class FileHandlingProject {
        public static void appendStrToFile(String fileName, String str)
        {
            try {
                BufferedWriter out = new BufferedWriter(
                        new FileWriter(fileName, true));

                out.write(str);
                out.close();
            }
            catch (IOException e) {


                System.out.println("exception occurred" + e);
            }
        }

        public static void main(String[] args) throws Exception
        {
            String fileName = "Ankit.txt";

            try {
                BufferedWriter out = new BufferedWriter(
                        new FileWriter(fileName));

                out.write("Hello Ankit :\n");

                out.close();
            }

            catch (IOException e) {

                System.out.println("Exception Occurred" + e);
            }


            String str = "How Are you";

            appendStrToFile(fileName, str);

            try {
                BufferedReader in = new BufferedReader(
                        new FileReader("Ankit.txt"));

                String mystring;
                while ((mystring = in.readLine()) != null) {
                    System.out.println(mystring);
                }
            }

            catch (IOException e) {
                System.out.println("Exception Occurred" + e);
            }
        }
    }


