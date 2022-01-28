package com.test;

import java.util.ArrayList;

public class UndeestandingArraysList {
    public static void main(String[]args){
        ArrayList<String> listOfNames = new ArrayList<>();
      listOfNames.add("Ankit");
      listOfNames.add("Mishra Ji");
      listOfNames.add("Ankit");
      listOfNames.add("Shahgarh");
        System.out.println("Size of the arrays :" +listOfNames.size());
     //   listOfNames.remove(4);
       // System.out.println("List size after deleting an object : " + listOfNames.size());
       // System.out.println(listOfNames);
        System.out.println("We have the following learners registered:");
//		Traverse through the list: traditonal for loop
		for(int index = 0; index < listOfNames.size(); index++) {
			System.out.println(listOfNames.get(index));
	}



    }
}
