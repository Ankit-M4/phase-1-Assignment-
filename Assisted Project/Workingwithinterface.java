package com.test;

public class Workingwithinterface {
    public static void main(String[]args) {
        abcd w = new abcd();
        w.eat();
        System.out.println("----------");
        w.walk();
        System.out.println("----------");
        w.fight();
        System.out.println("----------");
        w.home();
        System.out.println("----------");
    }
}
 interface Ankit{
    void run();
    void walk();
    void eat();

}
interface anshul{
    void fight();
}
interface ghr{
    void home();
}
class abcd implements Ankit,anshul,ghr {
    @Override
    public void run() {
        System.out.println("abcd can eat");
    }
    @Override
    public void walk(){
        System.out.println("abcd can walk");
    }
    @Override
    public void eat(){
        System.out.println("abcd can eat");
    }
    @Override
    public void fight(){
        System.out.println("abcd can fight");
    }
    @Override
    public void home(){
        System.out.println("abcd can live in the house");
    }
}
