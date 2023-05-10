package lesson18_Arrays;

import java.util.Arrays;

public class ArraysNaturalOrder {
    public static void main(String[] args) {

        int[] sira = {6, 8, 0, 3, 1, 4 ,9, 7, 5};
        System.out.println(Arrays.toString(sira)); // [6, 8, 0, 3, 1, 4, 9, 7, 5]

        // Natural Order
        Arrays.sort(sira);
        System.out.println(Arrays.toString(sira)); // [0, 1, 3, 4, 5, 6, 7, 8, 9]
    }
}
