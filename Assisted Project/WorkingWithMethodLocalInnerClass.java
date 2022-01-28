package com.test;

public class WorkingWithMethodLocalInnerClass {
    public static void main(String[] args){
Ankittt obj = new Ankittt();
obj.fun();

    }
}
class Ankittt {
    void fun() {
        int a  = 20;
        class mobile {
            void av(){
                System.out.println("Inside me");
                System.out.println(a);
            }

        }
        new mobile().av();
    }
}
