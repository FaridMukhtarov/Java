package lesson39_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class arraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {

        /*
        Sual:
        Verilmiş array-de təkrarlanan elementləri yalnız bir dəfə çap etmək üçün array-i qısaldan kod yazın
        İpucu: SET istifadə edin.
        int [] arr={1,2,1,3,4,5,1,2,6,2,3,4,5,1,3,2,6,5,7}
        */

        int [] arr={1,2,1,3,4,5,1,2,6,2,3,4,5,1,3,2,6,5,7};
        Set<Integer> set = new HashSet<>();

        for (Integer each : arr) {
            set.add(each);
        }

        System.out.println(set); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(Arrays.toString(arr)); // [1, 2, 1, 3, 4, 5, 1, 2, 6, 2, 3, 4, 5, 1, 3, 2, 6, 5, 7]


        arr = new int[set.size()];
        int index = 0;

        for (Integer each : set) {
            arr[index] = each;
            index++;
        }
        System.out.println("array'in son hali: "+ Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7]
    }
}
