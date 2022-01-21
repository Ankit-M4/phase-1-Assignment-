package com.test;

public class WorkingWithTherds {
    public static class MyThread extends Thread
    {
        public void run()
        {
            System.out.println("hiii Everyone What Are Yor Doing ..");
        }
        public static void main( String args[] )
        {
            MyThread mt = new  MyThread();
            mt.start();
        }
    }

}
