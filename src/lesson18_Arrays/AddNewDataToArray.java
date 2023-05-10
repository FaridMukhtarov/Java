package lesson18_Arrays;

import java.util.Arrays;

public class AddNewDataToArray {
    public static void main(String[] args) {

        String str = "Java";
        str = "Hava";

        // var olan bir array-in uzunlugu deyisdirilemez
        // amma var olan bir array-a yeni array deyeri elave eymek olar


        // 1- var olan bir array-i yeni yeni deyer olaraq elave ede bilerik
        String[] arr1 = {"Ali", "Veli"};
        String[] arr2 = {"A", "B", "C"};

        arr1=arr2;
        System.out.println(Arrays.toString(arr1)); // [A, B, C]


        // 2- istedyimiz uzunluqda yeni bos bir array deyeri elave ede bilerik
        arr1 = new String[6];
        System.out.println(Arrays.toString(arr1)); // [null, null, null, null, null, null]


        // 3- Yeni yaradilan bir array-a { } icinde deyer yazaraq deyer elave ede bilerik
        // ancaq var olan bir array-e yeni deyer elave etmek ucun { } istifade edilmez

    }
}
