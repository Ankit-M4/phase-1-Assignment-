package com.test;

public class WorkingWithAnnoymousInnerClassDemo {
    public static void main(String[]args){
        Student theStudent = new Student() {
            @Override
            public void id() {
                System.out.println("student have a own id");
            }
        };
        theStudent.id();

    }
}
interface Student{
    void id();
}
