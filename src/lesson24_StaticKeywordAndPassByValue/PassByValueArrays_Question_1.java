package lesson24_StaticKeywordAndPassByValue;

import java.util.Arrays;

public class PassByValueArrays_Question_1 {
    public static void main(String[] args) {

        // Verilen bir Array-in Elementlerini 5 artirib
        // sonra yazdiran bir method yaradin

        int[] arr={3,4,5};
        System.out.println(Arrays.toString(arr)); // [3, 4, 5]

        elementArtirma(arr); // [8, 9, 10]

        // Qalici olaraq deyisdi
        System.out.println("Method call-dan sonra main method-un icinde arr: " + Arrays.toString(arr)); // [8, 9, 10]
    }

    // Arrays-da method-da (PassByValue) deyislilen elementi qalici olaraq deyisir
    private static void elementArtirma(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
        System.out.println(Arrays.toString(arr));
    }
}
