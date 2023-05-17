package lesson38_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_02 {
    public static void main(String[] args) {

        // hasNext() Iterator-da hələ element varsa true verecek
        // next() Iterator-da sonraki elementi gosterir
        // remove() Iterator-da verdiyi elementi siler

        List<Integer> reqemler = new ArrayList<>();
        reqemler.add(10);
        reqemler.add(20);
        reqemler.add(30);
        reqemler.add(40);
        reqemler.add(50);

        Iterator it1 = reqemler.iterator();

        // Butun elementleri Iterator istifade ederek yazdir
        System.out.println(it1.hasNext()); // true
        System.out.println(it1.next()); // 10

        System.out.println(it1.hasNext()); // true
        System.out.println(it1.next()); // 20

        System.out.println("==================");

        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        // iterator hara qeder iterate ettiysek orda qalir
        // basdan etibaren yazdirmaq istersek, yeni bir iterator yaradmagimiz lazimdir
        Iterator it2 = reqemler.iterator();
        System.out.println("==================");

        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
