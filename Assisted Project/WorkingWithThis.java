package com.test;

public class WorkingWithThis {
    int flag;
    public static void main(String[]args){
        WorkingWithThis h = new WorkingWithThis();
        h.fun();
        System.out.println(h.flag);

    }
    void meet(){
    System.out.println(" here");
    //this.fun();

    }
    void fun(){
        System.out.println("here not");

    //    this.meet();
        this.flag = 12;
        System.out.println(flag);
    }

}
