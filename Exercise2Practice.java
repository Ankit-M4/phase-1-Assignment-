package Assignment2.Another;
import Assignment2.Exercise2;
//here we can call  class Exercise2 in another package by using inheritance

 class Exercise2Practice {
     static class b extends Exercise2{
     public static void main(String[]args) {
         b obj = new b();
        obj.fun();


        }
    }
}
