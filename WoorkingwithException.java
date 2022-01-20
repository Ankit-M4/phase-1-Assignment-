package com.test;
import java.util.*;
public class WoorkingwithException {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first  number ");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();
        divideNumber(a,b);


}
static void divideNumber(int a,int b){
    int result = 0;
    try{
      result = a/b;
        System.out.println("division of the number is:" +result);
    }
    catch (Exception sea){
        System.out.println("tumse nhi ho payega");
    }
}
}
