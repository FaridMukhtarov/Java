package lesson38_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_01 {
    public static void main(String[] args) {

        // hasNext() Iterator-da hələ element varsa true verecek
        // next() Iterator-da sonraki elementi gosterir
        // nextIndex() bir sonraki elementin index-i verir

        // remove() Iterator-da verdiyi elementi siler
        // set() Bir Collection-daki elementi deyisdiri
        // add() Collection-na yeni bir element elave edir

        // hasPrevious() Iterator-da geriye dogru hereket ederken irelide element varsa true deyerini verecek
        // previous() Iterator-da evelki elementi gosterir
        // previousIndex() evelki elementin index-i verir


        List<Integer> reqemler = new ArrayList<>();
        reqemler.add(10);
        reqemler.add(20);
        reqemler.add(30);
        reqemler.add(40);
        reqemler.add(50);

        // iterator istifade ederek, listenin elementlerini sondan basa dogru yazdirin
        // evelce iterator-u sona gotur

        ListIterator lit1 =  reqemler.listIterator();
        while (lit1.hasNext()){
            lit1.next();
        }

        // Indi sondan basa dogru gedek, gederken elementleri yazdir
        while (lit1.hasPrevious()){
            System.out.print(lit1.previous() + " "); // 50 40 30 20 10
        }

        // eger iterator'i harda buraxtigimizi xatirlamasaq
        // iterator.nextIndex() ile hansi index'in evelinde oldugumuzu gorbilerik
        System.out.println();
        System.out.println(lit1.nextIndex()); // 0

        // iterator istifade edrek, listenin butun elementlerini 5 artirin

        while (lit1.hasNext()){
            lit1.set((Integer)lit1.next()+5);
        }
        System.out.println(reqemler); // [15, 25, 35, 45, 55]

        // iterator istifade ederk 40'dan kicik olan elementleri silin

        while (lit1.hasPrevious()){
            if ((Integer)lit1.previous()<40){
                lit1.remove();
            }
        }
        System.out.println(reqemler); // [45, 55]
    }
}
