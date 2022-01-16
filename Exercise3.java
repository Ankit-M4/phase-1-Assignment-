package Assignment2;
import java.util.*;

public class Exercise3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
    //    calculater cal = new calculater();
            System.out.println("enter first  number : ");
            int a = sc.nextInt();
            System.out.println("enter second number : ");
            int b = sc.nextInt();
            System.out.println("************************************** ");
            System.out.println("Enter which operation do you want to perform : ");
            System.out.println("Press 1 for Addition ");
            System.out.println("Press 2 for Subtraction ");
            System.out.println("Press 3 for Multiplication ");
            System.out.println("Press 4 for Division ");
            int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Addition of given numbers:    "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction of given numbers    "+ (a-b));
                break;
            case 3:
                System.out.println("Multiplication of given numbers  "+a*b);
                break;
            case 4:
                System.out.println("Division of given numbers    "+a/b);
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }



 /*           if (choice == 1) {
    //            cal.add(a, b);
                System.out.println("Addition of given numbers:    "+(a+b));
            } else if (choice == 2) {
    //            cal.subtraction(a, b);
                System.out.println("Subtraction of given numbers    "+ (a-b));
            } else if (choice == 3) {
    //            cal.multiply(a, b);
                System.out.println("Multiplication of given numbers  "+a*b);
            } else if (choice == 4) {
    //            cal.division(a, b);
                System.out.println("Division of given numbers    "+a/b);
            } else {
                System.out.println("Invalid Entry");
            }
       */


        }
    }

/*class  calculater {
    void add(int x,int y){
        System.out.println("Addition of given numbers:    "  +x+y);
    }
    void  multiply(int x, int y)
    {
        System.out.println("Multiplication of given numbers  "+x*y);
    }
    void  division(int x, int y){
        System.out.println("Division of given numbers    "+x/y);

    }
    void subtraction(int x, int y)
    {
        System.out.println("Subtraction of given numbers    "+ (x-y));
    }
}*/
