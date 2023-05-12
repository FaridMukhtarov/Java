package lesson21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods_2 {
    public static void main(String[] args) {

        // ArrayList Methods - 2 Half
        List<Integer> numbers = new ArrayList<>();
        int [] arrNum = {1,4,3,9,3,4,2,7,8,3};

        for (int i = 0; i < arrNum.length; i++) {
            numbers.add(arrNum[i]);
        }
        System.out.println(numbers);

        // .indexOf list-deki index-i verir
        System.out.println(numbers.indexOf(3)); // 2
        System.out.println(numbers.lastIndexOf(3)); // 9


        // .removeAll List-de olan diger list-leri siler
        numbers.removeAll(numbers); // Nested List name
        System.out.println(numbers); // []

    }
}
