package AdditionalQuestions;

import java.util.Arrays;

public class ArraysQuestion_7 {
    public static void main(String[] args) {

        // Verilen bir array-e istəlinen elementi əlavə edən və
        // onu bizə qaytaran metod yazın, köhnə array-e yeni dəyəri təyin edin.

        int [] array = {4, 5, 8, 6,};
        int element = 9;

        array = arrayeElementElaveEtmek(array, element);
        System.out.println(Arrays.toString(array));
    }
    public static int[] arrayeElementElaveEtmek (int[] array, int element ) {

        int[] yeniArray = new int[array.length+1];

        for (int i = 0; i < array.length; i++) {
            yeniArray[i] = array[i];
        }
        yeniArray[yeniArray.length-1] = element;
        return yeniArray;
    }
}
