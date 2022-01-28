package com.test;
public class WorkingWithAbtractclass {
    public static void main(String[]args){
        makan ref = new pa();
        ref.person();
        ref.room();
        ref.normal();
        ref.gate();
    }
}
abstract class makan{
     abstract void person();
      abstract   void room ();
      void normal(){
         System.out.println("person be a normal");
     }
     abstract void gate();
}
class pa extends makan{
    @Override
       void person (){
        System.out.println("we can count person by using fingers");
    }
    @Override
       void room(){
        System.out.println("we caqn count room by using fingers");
    }
    @Override
    void normal(){
        super.normal();
        System.out.println("person be  not be a normal");
    }
    @Override
    void gate(){
        System.out.println("we can count a gate");
    }
}