package com.test;
import java.util.LinkedList;
import java.util.regex.*;
import java.util.*;

public class CheckingMailIsVaildOrNot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email id ");
        LinkedList<String>  emails = new LinkedList<>();
               // emails.add("Hiibudy@domain.co.in");
               // emails.add("Check@domain.com");
               // emails.add("Java#@domain.co.in");
        String email1  = sc.nextLine();
        emails.add(email1);

                String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

                Pattern pattern = Pattern.compile(regex);

                for(String email : emails){

                    Matcher matcher = pattern.matcher(email);
                    System.out.println(email +" : "+ matcher.matches()+"\n");
                }
            }
        }


