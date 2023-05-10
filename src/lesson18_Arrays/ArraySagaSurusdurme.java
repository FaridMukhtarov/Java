package lesson18_Arrays;

import java.util.Arrays;

public class ArraySagaSurusdurme {
    public static void main(String[] args) {

        // Verilen bir array’deki butun elementleri bir saga surusdurub, sondaki elementi de
        // basa geterib bir method yaradin, array’i yeni haliya yadasa verin.
        // input : [4,5,6,7]  output : [7,4,5,6]

        int [] arr = {4,5,6,7,9};
        arr = sagaSurudur(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] sagaSurudur (int[] arry){
        int bos = arry[arry.length-1]; // elementi bos qaba qoyduq
        for (int i = arry.length-2; i >= 0 ; i--) {
            arry[i+1] = arry[i];
        }
        arry[0] = bos;

        return arry;
    }

}
