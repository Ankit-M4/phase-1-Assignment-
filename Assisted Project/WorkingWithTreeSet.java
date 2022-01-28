package com.test;

import java.util.TreeSet;

public class WorkingWithTreeSet {
    public static void main(String[]args){
        TreeSet<String> hj = new TreeSet<String>();
        hj.add("virat kohli");
        hj.add("rohit sharma");
    //    hj.add("virat kohli");
        hj.forEach(System.out::println);
    }
}
