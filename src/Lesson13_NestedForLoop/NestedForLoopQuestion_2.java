package Lesson13_NestedForLoop;

public class NestedForLoopQuestion_2 {
    public static void main(String[] args) {

        // Verilen bir eded ucun asagidaki tabloyu yarat

        /*
        1*1  1*2  1*3
        2*1  2*2  2*3
        3*1  3*2  3*3
         */

        int eded = 5;

        for (int i = 1; i <= eded; i++) {
            for (int j = 1; j <= eded; j++) {
                System.out.print(i + "*" + j + "  ");
            }
            System.out.println("");
        }
    }
}