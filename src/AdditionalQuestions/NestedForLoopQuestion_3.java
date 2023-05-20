package AdditionalQuestions;

public class NestedForLoopQuestion_3 {
    public static void main(String[] args) {

        // Aşağıdakı Sekili çap edin

        /*

         *
         *  *
         *  *  *
         *  *  *  *
         *  *  *  *  *
         *  *  *  *
         *  *  *
         *  *
         *

         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 4; j++) {

                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
