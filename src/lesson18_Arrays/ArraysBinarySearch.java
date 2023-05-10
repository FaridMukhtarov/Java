package lesson18_Arrays;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {

        int[] sira = {6, 8, 0, 3, 1, 4 ,9, 7, 5};

        System.out.println(Arrays.binarySearch(sira,9)); // index 6
        System.out.println(Arrays.binarySearch(sira,1)); // index 4
        System.out.println(Arrays.binarySearch(sira,4)); // index 5
        System.out.println(Arrays.binarySearch(sira,6)); // index -7


        Arrays.sort(sira); // [0, 1, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.binarySearch(sira,9)); // index 8
        System.out.println(Arrays.binarySearch(sira,1)); // index 1
        System.out.println(Arrays.binarySearch(sira,4)); // index 3
    }
}
