package AdditionalQuestions;

import java.util.Arrays;

public class ArraysQuestion_1 {
    public static void main(String[] args) {

        // Verilmiş int array-in bütün elementlərini 2 artıran və onu bizə qaytaran method yaradın.
        // Köhnə array-i yeni olduğu kimi yadda saxlayın.

        int [] array = {4, 5, 8, 6,};
        array = arrayIkiArtirma(array);
        System.out.println(Arrays.toString(array));

    }

    public static int[] arrayIkiArtirma (int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] += 2;
        }
        return array;
    }
}
