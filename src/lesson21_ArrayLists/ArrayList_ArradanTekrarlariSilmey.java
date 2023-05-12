package lesson21_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_ArradanTekrarlariSilmey {
    public static void main(String[] args) {

        // Verilen bir arrayList-deki tekrar eden reqemleri
        // unique olaraq yazdir her bir elementi
        // ve yeni array-y elave et

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!number.contains(arr[i])){
                number.add(arr[i]);
            }
        }
        arr = new int [number.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
