package Assignment2;

public class WorkingWithArrayAndTypes {
    //single dimensional arrays
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        for (int i = 0; i <= a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void getaVoid() {
        aVoid();
    }



    public static void   aVoid()

    {
        int[][] b = {{10, 50, 93, 45}, {50, 36, 69, 87}, {20, 45, 58, 58}};
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.println(b[i][j]);
            }
            System.out.println();
        }

    }
}

