package Lesson13_NestedForLoop;

public class NestedForLoopStars_Ucbucaq {
    public static void main(String[] args) {

        /* Nested for loop istifade ederek asagidaki sekili yarad
        *
        * *
        * * *
        * * * *
        * * * * *
         */

        int ulduz = 5;

        for (int i = 1; i <=ulduz; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
