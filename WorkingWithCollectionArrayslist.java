package Assignment2;import java.util.ArrayList;
import java.util.Iterator;
 public class WorkingWithCollectionArrayslist {
    public static void main(){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ankit");//Adding object in arraylist
        list.add("Mishra");
        list.add("Ankit");
        list.add("vinay");
//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}


