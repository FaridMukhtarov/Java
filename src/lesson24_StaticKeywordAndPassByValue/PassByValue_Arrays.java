package lesson24_StaticKeywordAndPassByValue;

import java.util.Arrays;

public class PassByValue_Arrays {
    public static void main(String[] args) {

        int [] arr = {6, 8, 3, 2, 4};
        System.out.println(Arrays.toString(arr)); // [6, 8, 3, 2, 4]
        changeArraysElement(arr);
        System.out.println(Arrays.toString(arr)); // [5, 8, 3, 2, 7]


        newArrays(arr);
        System.out.println(Arrays.toString(arr)); // [5, 8, 3, 2, 7]
    }

    // Arrays-da PassByValue deyislilen yeni arrays qalici olaraq qalmir
    private static void newArrays(int[] arr) {
        int [] newArrays = {3,5,5,9,0};
        arr = newArrays;
        System.out.println(Arrays.toString(arr)); // [3, 5, 5, 9, 0]
    }

    // Arrays-da PassByValue deyislilen elementi qalici olaraq deyisir
    private static void changeArraysElement(int[] arr) {
        arr[0] = 5;
        arr[4] = 7;
    }
}
