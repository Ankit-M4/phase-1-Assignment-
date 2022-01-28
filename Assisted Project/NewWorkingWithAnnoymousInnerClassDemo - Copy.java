package com.test;
public class NewWorkingWithAnnoymousInnerClassDemo {
    public static void main(String[]args){
        others others = new others();
        others.Dosomethings(new sir() {
            @Override
            public void teach() {
                System.out.println("i dont like today class");
            }
        });
    }
}
interface sir{
    void teach();
}
 class students implements sir{
    @Override
     public void teach() {
    }
 }
class others{
    void Dosomethings(sir ref) {
        ref.teach();
    }
}
