package com.test;

import java.util.HashMap;
import java.util.HashSet;

public class WorkingwithHashset {
    public static void main(String[]args){
        HashSet<String> set = new HashSet<>();
        set.add("hii");
        set.add("hlw");
        set.add("How are you");
        set.add("How are you");
        set.forEach(System.out::println);

    }
}
