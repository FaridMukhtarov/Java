package lesson20_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int [] [] arr = {{2,4,4}, {3,7,8,5}, {9,0,7,5,2,1}};

        System.out.println(arr.length); // 3
        System.out.println(arr[2].length); // 6-length {9,0,7,5,2,1}
        System.out.println(arr[1]); // [I@4dd8dc3
        System.out.println(Arrays.toString(arr[1])); // [3, 7, 8, 5]
        // Butun array-i yazdirmaq ucun (deepToString)
        System.out.println(Arrays.deepToString(arr)); // [[2, 4, 4], [3, 7, 8, 5], [9, 0, 7, 5, 2, 1]]
        System.out.println(arr[1][2]); // 8
        System.out.println(arr[2][4]); // 2
        System.out.println(arr[2][0]); // 9
    }
}
