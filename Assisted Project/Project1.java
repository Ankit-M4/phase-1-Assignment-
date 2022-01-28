package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Project1 {
    public static void mainMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        String choise = "yes";

        String path = "C:\\Users\\ANKIT\\Desktop\\Project_Files";
        File file = new File(path);

        System.out.println("******************* Main Menu ******************************");

        while (choise.equals("yes")) {
            System.out.println("Press 1 to view all the existing files in the directory :  ");
            System.out.println("Press 2 to Perform Opeartions on files :");
            System.out.println("Press 3 to Exist from application :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (file.isDirectory()) {
                        List listFile = Arrays.asList(file.list());
                        Collections.sort(listFile);
                        System.out.println("Files present at specficed path :- ");
                        for (Object s : listFile) {
                            System.out.println(s);
                        }
                        if (listFile.isEmpty()) {
                            System.out.println("Files Not Available at specified Location");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Press 1 to create new file : ");
                    System.out.println("Press 2 for delete a file : ");
                    System.out.println("Press 3 for search a file : ");
                    System.out.println("Press 4 for go back to main menu : ");
                    int fileOperation = sc.nextInt();

                    switch(fileOperation) {

                        case 1:
                            System.out.println("Enter new file name :- ");
                            String createFileName = sc.next();
                            String path1 = path.concat("\\" + createFileName);
                            File newFile = new File(path1);
                            newFile.createNewFile();
                            System.out.println("File created successfully");
                            break;
                        case 2:
                            System.out.println("Enter file name to delete :- ");
                            String deleteFileName = sc.next();
                            String path2 = path.concat("\\" + deleteFileName);
                            File deleteFile = new File(path2);
                            if (deleteFile.delete()) {
                                System.out.println("File Delete Successfully");
                            } else {
                                System.out.println(" File does not exists");
                            }
                            break;
                        case 3:
                            System.out.println("Enter file name for search :- ");
                            String searchFileName = sc.next();
                            String path3 = path.concat("\\" + searchFileName);
                            File searchFile = new File(path3);
                            if (searchFile.exists()) {
                                System.out.println("File Exists");
                            } else {
                                System.out.println("File Does Not Exists");
                            }
                            break;
                        case 4:
                            mainMenu();

                    }
                    break;

                case 3:
                    choise = "no";
                    break;

            }
            if (choise.equals("no")) {
                System.out.println("Thanks For Using Our Application ");
                break;
            }
            System.out.println("************************************************************");
            System.out.println("Do you want to Perform more operations (yes/no) : ");
            choise = sc.next();
            if (choise.equals("no")) {
                System.out.println("Thanks For Using Our Application ");
                break;
            }


        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println("----------------- Welcome in File Explorer Project ----------------");
        System.out.println();
        System.out.println("\t\t\t\t\t Developed By : Ankit Mishra ");
        System.out.println();
        System.out.println("********************************************************************");

        mainMenu();
    }

}
