package lesson22_ForEachLoop;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ForEachLoop_3 {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //  - Kelimenin uzunlugu cift sayi ise ilk yarisini
        //  - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //    yeni bir listeye ekleyip yazdirin.

        String[] arr = {"Ferid", "Elgun", "Arzu", "Elsen", "Ferahim" };
        List<String> cut = new ArrayList<>();

        for (String each : arr) {
            if (each.length() % 2 == 0 ) {
                cut.add(each.substring(0,each.length() / 2));
            }
            else {
                cut.add(each.substring((each.length()-1) / 2));
            }
        }
        System.out.println(cut);
    }
}
