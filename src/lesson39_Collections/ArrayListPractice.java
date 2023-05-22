package lesson39_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayListPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(7);
        list.add(null);
        list.add(9);
        list.add(1);

        // Listeki elementlerin sayini verir
        System.out.println(list.size()); // 6

        // index-deki elementi verir
        System.out.println(list.get(2)); // 7

        // List-de elementin olub olmadigina baxir
        System.out.println(list.contains(9)); // true

        // list-in Hash Code-unu verir
        System.out.println(list.hashCode()); // 1040093463

        // Elementin necenci index-de oldugunu verir
        System.out.println(list.indexOf(9)); // 4

        // List bos olub olmadigini yoxlayir
        System.out.println(list.isEmpty()); // false

        // listeki bir elementi yeni bir elementle deyismek
        System.out.println(list.set(0,6));  // kohne elemet 5

        // listekdi istelinen elementi silmek
        System.out.println(list.remove(1)); // silinen elemet 10

        // listen balaca yani subList yaratmaq
        System.out.println(list.subList(1,4)); // [7, null, 9]


        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
