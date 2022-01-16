package Assignment2;

public class Exercise4 {
    public static void main(String[]args){
        System.out.println(checkIntegerReturnType());
        checkVoidReturnType();
        System.out.println(checkStringReturnType());
    }
    // No return in void
   static   void checkVoidReturnType (){
       System.out.println("Void methods does not have any return type");
    }
    static int checkIntegerReturnType(){
        return 100;
    }
     static  String checkStringReturnType(){
        return "Ankit";
    }
}
