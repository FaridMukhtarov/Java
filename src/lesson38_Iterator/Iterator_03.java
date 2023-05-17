package lesson38_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_03 {
    public static void main(String[] args) {

        List<Integer> reqemler = new ArrayList<>();
        reqemler.add(10);
        reqemler.add(20);
        reqemler.add(30);
        reqemler.add(40);
        reqemler.add(50);

        // iterator istifade ederek bu listeden 15 ile 35 arasindaki reqemleri sil
        Iterator it1 = reqemler.iterator();
        Integer element;

        while (it1.hasNext()){
            element = (Integer) it1.next();

            if (element > 15 && element < 35){
                it1.remove();
            }
        }
        System.out.println(reqemler); // [10, 40, 50]

        reqemler.add(20);
        reqemler.add(30);
        System.out.println(reqemler); // [10, 40, 50, 20, 30]

        // Butun elementleri iterator  ile sil
        Iterator it2 = reqemler.iterator();

        // Manual
        it2.next();
        it2.remove();

        // Entire
        while (it2.hasNext()){
            it2.next();
            it2.remove();
        }
        System.out.println(reqemler);

    }
}
