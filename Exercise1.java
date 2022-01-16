package Assignment2;
import java.util.*;
public class Exercise1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :-  ");
        String str = sc.nextLine();
        System.out.println();

        System.out.println("****** Converting to Data Types ************");
        printType(str);
        //     System.out.println(str.getClass().getSimpleName());

        int i  = Integer.parseInt(str);
        printType(i);

        Long l  =Long.parseLong(str);
        printType(l);

    }

    public static void printType(int x){
        System.out.println("Entered text is integer");
    }
    public static void printType(String x){
        System.out.println("Entered text is string");
    }
    public static void printType(Boolean x){
        System.out.println("Entered text is boolean");
    }
    public static void printType(long x){
        System.out.println("Entered text is Long");
    }


}
