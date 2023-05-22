package AdditionalQuestions;

import java.util.Arrays;

public class MultiDimensionalArrayQuestion_2 {
    public static void main(String[] args) {

        // Verilen 2 qatli bir array’de ayni index’e sahip elementleri toplayip,
        // yeni yaradacagimiz tek qatli bir array’e bu toplamlari elave edin.

        // input : int[][] arr = {{3,4,5}, {2,3,6,7}}; output: [5, 7, 11]

        int[][] arr = {{3,4,5}, {2,3,6,7}};

        int uzunluq = arr[0].length<arr[1].length ? arr[0].length : arr[1].length ;
        int[] yeniArray = new int[uzunluq];

        for (int i = 0; i < yeniArray.length; i++) {

                    yeniArray[i] = arr[0][i] + arr[1][i];
                }
        System.out.println(Arrays.toString(yeniArray));
    }
}
