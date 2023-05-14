package lesson24_StaticKeywordAndPassByValue;

import java.util.Arrays;

public class PassByValueArrays_Question_2 {
    public static void main(String[] args) {

        // bir method yarad
        // index-i uzunlugu 2 eded artiq olsun
        // ve elementleri hamisinin deyeri 5 olsun
        // deyer olaraqda yeni arrya assigment ele

        int[] reqemler= {3,4,5,6};
        arryYeniDeyer(reqemler); // [5, 5, 5, 5, 5, 5]

        // Arrays-da PassByValue deyislilen yeni arrays qalici olaraq qalmir
        System.out.println(Arrays.toString(reqemler)); // [3, 4, 5, 6]
    }

    private static void  arryYeniDeyer(int[] reqemler) {
        int[] yeniArray = new int [reqemler.length+2];

        for (int i = 0; i < yeniArray.length; i++) {
            yeniArray[i] = 5;
        }
        reqemler = yeniArray;
        System.out.println("Method-da reqemlerin son halli: " + Arrays.toString(reqemler));
    }
}
