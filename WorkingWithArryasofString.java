package Assignment2;
import java.util.*;
public class WorkingWithArryasofString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String[] names =  {"Ankit", "Anshul", "Abc", "XYZ", "PQM"};
        String Input;
        int found = 0;
        System.out.println("Enter Name to search in our  database : ");
        Input = sc.nextLine();

        for (int i =0; i<names.length;i++) {
            if (Input.equals(names[i])) {
                found++;
            }
        }
        if(found == 1){
            System.out.println("Name found");
        }
        else {
            System.out.println("Name do not found");
        }
    }

    }

