package com.github;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class workingwithMapDemo {


        public static void main(String[] args) {
            // map

            //Hashmap
            HashMap<Integer,String> hm=new HashMap<Integer,String>();
            hm.put(1,"Ankit");
            hm.put(2,"Mary");
            hm.put(3,"me");

            System.out.println("\nThe elements of Hashmap are ");
            for(Map.Entry m:hm.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }

            //HashTable

            Hashtable<Integer,String> ht=new Hashtable<Integer,String>();

            ht.put(4,"In ");
            ht.put(5,"India");

            System.out.println("\nThe elements of HashTable are ");
            for(Map.Entry n:ht.entrySet()){
                System.out.println(n.getKey()+" "+n.getValue());
            }


            //TreeMap

            TreeMap<Integer,String> map=new TreeMap<Integer,String>();
            map.put(8,"Annie");
            map.put(9,"Carlotte");
            map.put(10,"Catie");

            System.out.println("\nThe elements of TreeMap are ");
            for(Map.Entry l:map.entrySet()){
                System.out.println(l.getKey()+" "+l.getValue());
            }

        }
    }


