package lesson18_Arrays;

import java.util.Arrays;

public class ButunElementleriArtir {
    public static void main(String[] args) {

        // Verilen bir int array-in butun elementlerini
        // istelinen qeder artirib bize donderen bir method yarad
        // kohne array-i yeni haliyla yada saxla

        int[] arr = {2,4,6,7,8,2,9,3,2,67};
        int artiran = 2;

        arr = elementArtirma(arr, artiran);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] elementArtirma (int[] arry, int artiran){
        for (int i = 0; i < arry.length; i++) {
            arry[i] += artiran;
        }
        return arry;
    }
}
