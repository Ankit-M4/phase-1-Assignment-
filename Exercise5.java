package Assignment2;

public class Exercise5 {
    public static void main(String[]args){

    Construtors con = new Construtors(10);  // Parameterized Constructor calling
    Construtors con1 = new Construtors();  //  Non Parameterized Constructor calling
    }
}

class Construtors {
    //parameterized Construtors
     public Construtors(int x){
         System.out.println("This is Parameterized Constructor");
     }
     //Default Construtors
     public Construtors(){
         System.out.println("This is not Parameterized Constructor");
     }

}
