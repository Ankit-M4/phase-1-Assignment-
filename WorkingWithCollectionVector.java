package Assignment2;
import java.util.*;
public class WorkingWithCollectionVector {
    public static void main(String args[]){
            Vector<String> v=new Vector<String>();
            v.add("Ayush");
            v.add("Amit");
            v.add("Ankit");
            v.add("sharma");
            Iterator<String> itr=v.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }


