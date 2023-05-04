package Lesson13_NestedForLoop_MethodCreation;

public class NestedForLoopStars_Dorbucaq {
    public static void main(String[] args) {

        /* asagidaki sekili yazdiran bir kod hazirlayin
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */

        for (int i = 1; i <= 6; i++) { // outer loop (Setirleri Yoxlayir)
            for (int j = 1; j <= 6 ; j++) { // inner loop (Sutunlari Yoxlayir)
                System.out.print(" * ");

            }
            System.out.println(""); // Ic loop bitende alt setire kec

        }
    }
}
