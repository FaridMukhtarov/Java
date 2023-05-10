package lesson18_Arrays;

import java.util.Arrays;

public class ArrayYeniElemetElaveEt {
    public static void main(String[] args) {

        int[] arr = {2,4,6};
        // bu arr-a 4. bir element olaraq 8 elave et

        /*
        var olan bir array-a yeni elemet elave edile bilmez
        amma yeni deyer elave edile biler
         */

        int[] arr2 = new int [arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];

        }
        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 0]

        arr2[arr2.length-1] = 8;

        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 8]

        arr = arr2;
        System.out.println("'arr-in' son hali: " + Arrays.toString(arr2)); // [2, 4, 6, 8]

    }
}
