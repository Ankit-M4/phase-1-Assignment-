package com.test;
public class WokingWithRegularInnerClass {
    public static void main(String[]args){
      //new Sachin().new virat().on();
      Sachin out = new Sachin();
      Sachin.virat ref =  new Sachin().new virat();
      ref.on();
    }
}
  class Sachin{
    private int anushka = 45;
    class virat {
         private  int anushka = 50;
        void on(){
              int anushka = 1;
            System.out.println("hii virat please stop play cover drive ");
            System.out.println( virat.this.anushka);
            System.out.println(Sachin.this.anushka);
         virat hn = new virat();
         hn.in();
         virat nj = new virat();
         nj.both();
        }
        void in(){
            System.out.println("play cover drive after somme days");
        }
        void both(){
            System.out.println("you play  best cover drive  in the whole cricket history");
        }
    }
}
