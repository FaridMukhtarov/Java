package lesson21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_AllElementAdd {
    public static void main(String[] args) {

        List<String> herifler = new ArrayList<>();
        // Butun sesli herifleri list-de elave edin
        // elave edilecek butun elementleri bir array olaraq yazib
        // sonra for loop ile list-e elave ede bilerik

        String[] arr = {"a","e","i","o","u"};
        for (int i = 0; i < arr.length; i++) {
            herifler.add(arr[i]);
        }
        System.out.println(herifler); // [a, e, i, o, u]
    }
}
