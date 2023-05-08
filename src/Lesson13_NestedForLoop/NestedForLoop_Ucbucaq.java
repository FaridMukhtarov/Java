package Lesson13_NestedForLoop;

public class NestedForLoop_Ucbucaq {
    public static void main(String[] args) {

        /* Nested for loop istifade ederek asagidaki sekili yarad
        1
        2 4
        3 6 9
        4 8 12 16
        5 10 15 20 25
        */

        int eded = 6;

        for (int i = 1; i <=eded; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j*i +" ");

            }
            System.out.println("");

        }
    }
}
