package com.test;
import com.company.newworkwithaccesmodifire;

public class WorkingWithAnotherPackage extends newworkwithaccesmodifire {

    public static void main(String []args){
        int x = 10;
        System.out.println(x);

        newworkwithaccesmodifire obj = new newworkwithaccesmodifire();
        System.out.println(obj.fun);
        obj.meet();

    }
}
