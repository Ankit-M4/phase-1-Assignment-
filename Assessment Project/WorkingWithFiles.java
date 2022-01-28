package com.test;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class  WorkingWithFiles {
    public static void main(String[] args) throws IOException {
        ankit();
        String count;
        String cont = "y";
        int choice;
        File theFile = new File("Hiii Ankit");
        //  System.out.println("File exists:"+theFile.exists());
        theFile.createNewFile();
        System.out.println("File exists:" + theFile.exists());
        FileWriter Writer = new FileWriter(theFile);
        Writer.write("Hellow bhai");

        File newFolder = new File("New Folder");

        newFolder.mkdir();//Create a folder now
        String[] fileNames = new String[50];
        fileNames = newFolder.list();
        Scanner sc = new Scanner(System.in);
        while (cont.equalsIgnoreCase("y")) {
            System.out.println("************* Output **************");
            System.out.println("\t\t Employee Information System\n\n");
            System.out.println("Press 1 for File Exists ");
            System.out.println("Press 2 for delete a file ");
            System.out.println("Press 3 for search a file ");
            System.out.println("Press 4 for search  close the current execution context and return to the main context a file ");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("File Exists:" + theFile);
                    break;
                case 2:
                    System.out.println("delete a file " + new File(newFolder, "Hiii Ankit"));
                    break;
                case 3:
                    System.out.println("search a file" + newFolder.list());
                    break;
                case 4:
                    Writer.flush();
                    Writer.close();
                    System.out.println(" close the current execution context");

                    break;
                default:
                    System.out.println("Invalid Entry");

                    break;

            }
        }
    }

    public  static void ankit() {
        File fileDir = new File("C:\\temp");
        if (fileDir.isDirectory()) {
            List listFile = Arrays.asList(fileDir.list());
            System.out.println("Listing files unsorted");
            for (Object s : listFile) {
                System.out.println(s);
            }
            Collections.sort(listFile);
            System.out.println("---------------------------------------");
            System.out.println("Sorting by filename in ascending order");
            for (Object s : listFile) {
                System.out.println(s);
            }
        } else {
            System.out.println(fileDir.getAbsolutePath() + " is not a directory");
        }


    }
}