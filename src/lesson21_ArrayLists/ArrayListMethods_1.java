package lesson21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods_1 {
    public static void main(String[] args) {

        // ArrayList Methods - 1 Half
        List<Integer> numbers = new ArrayList<>();
        int [] arrNum = {1,4,3,9,3,4,2,7,8,3};

        for (int i = 0; i < arrNum.length; i++) {
            numbers.add(arrNum[i]);
        }
        System.out.println(numbers);

        // .size() List incinde elementin sayini verir
        System.out.println(numbers.size()); // 10

        // .isEmpty() list-in ici bos olub olmadigini yoxlayir
        System.out.println(numbers.isEmpty()); // false

        // .contains() Elementin olub olmamisini yoxlayir
        System.out.println(numbers.contains(5)); // false
        System.out.println(numbers.contains(2)); // true

        // .get() Istediyimiz index-deki elemeti istiye bileceyim
        System.out.println(numbers.get(5)); // 4

        // Java-da .set() Method-u Update (Yenileme) ucun istifade edilir
        // add() ile set() Ferqlidir
        System.out.println(numbers.set(0, 8)); // Kohne deyeride gosterir
        numbers.set(1,9);
        System.out.println(numbers);

        // .remove() ArrayList-deki istenilen deyeri silir
        numbers.remove(2);
        System.out.println(numbers); // 3

        numbers.remove(5);
        System.out.println(numbers); // 2

        /*
        List integer-lerden ibaretse
        biz int bir deyer yazdigimizda hemise index olaraq qebul etdiyinden
        istediyimiz elementi object olaraq girib sildirmek ucun evelceden
        tanitmaqimiz lazimdir
         */

        // Object yountemi ile silmek
        // ilk 4-du sildi
        Integer silinenElement = 4;
        numbers.remove(silinenElement); // 4
        System.out.println(numbers);

        // Butun 3-leri sil
        silinenElement = 3;
        while (numbers.contains(silinenElement)){
            numbers.remove(silinenElement);
        }
        System.out.println(numbers); // [8, 9, 9, 7, 8]

        // Liste olmayan bir deyeri silmek istesek Java false dondurer
        silinenElement = 10;
        System.out.println(numbers.remove(silinenElement)); // false

        // Olmuyan deyeri sout yazmayib silsek Java Exception verir
        // numbers.remove(20); // IndexOutOfBoundsException

        // . clear() List-deki Butun elementi silmek ucun
        numbers.clear();
        System.out.println(numbers); // []
    }
}
