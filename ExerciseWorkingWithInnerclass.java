package Assignment2;

public class ExerciseWorkingWithInnerclass {
    public static void main(String[]args){
        colleges colleges = new colleges();
        colleges.rollNum();
    }
}
class colleges {
    int num;

    private class student {
        public void id() {
            System.out.println("student have  a own id");
        }

    }

    void rollNum() {


        student students = new student();
        students.id();


    }
}
