package AdditionalQuestions;

import java.util.Arrays;

public class MultiDimensionalArrayQuestion_3 {
    public static void main(String[] args) {

        // Verilen 2 qatli bir array’de her bir ic array’deki elementleri toplayip,
        // yeni yaradacagimiz tek qatli bir array’e bu toplamlari elave edin.

        // input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        // output: [10, 3, 12, 10, 9]

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int toplama = 0;
        int[] yeniaray = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
               toplama += arr[i][j];
               yeniaray[i] = toplama;
            }
        }
        System.out.println(Arrays.toString(yeniaray));
    }
}
