package AdditionalQuestions;

public class NestedForLoopQuestion_2 {
    public static void main(String[] args) {

        // Aşağıdakı Sekili çap edin

               /*

                * * * *
                * * * *
                * * * *
                * * * *

                */

        int outer = 4;
        int inner = 5;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
