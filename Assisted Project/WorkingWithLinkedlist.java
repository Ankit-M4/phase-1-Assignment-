package com.test;

import java.util.LinkedList;
import java.util.List;

public class WorkingWithLinkedlist {
    public static void main(String[]Args){
        LinkedList<Integer> link  = new LinkedList();
        link.add(326);
        link.add(546);
        link.add(546);
        link.add(547);
        link.addLast(870);
        System.out.println(link.size());
       // System.out.println(link);
        link.forEach(System.out::println);

    }
}
