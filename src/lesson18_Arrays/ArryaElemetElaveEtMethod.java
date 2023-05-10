package lesson18_Arrays;

import java.util.Arrays;

public class ArryaElemetElaveEtMethod {
    public static void main(String[] args) {

        // verilen bir int array-a istelinen bir element
        // elave eden ve yeni halini bize donderen bir method yarad

        int[] arr = {3,5,8,9};
        int elaveEdilecek = 6;

        arr = arrayElemetElaveEtMethod(arr, elaveEdilecek);
        System.out.println(Arrays.toString(arr)); // [3, 5, 8, 9, 6]
    }
    public static int [] arrayElemetElaveEtMethod (int[] elaveEdilecekArray, int elaveEdilecekSayi){

        int[] yeniArray = new int[elaveEdilecekArray.length+1];
        for (int i = 0; i < elaveEdilecekArray.length; i++) {
            yeniArray[i] = elaveEdilecekArray[i];
        }
        yeniArray[yeniArray.length-1] = elaveEdilecekSayi;
        return yeniArray;
    }
}
