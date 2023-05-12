package lesson21_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListElementAdd {
    public static void main(String[] args) {

        List<Integer> reqemler = new ArrayList<>();
        System.out.println(reqemler); // []

        reqemler.add(20); // 20
        System.out.println(reqemler); // 20

        reqemler.add(10); // 10
        System.out.println(reqemler); // 10

        reqemler.add(1,5);
        System.out.println(reqemler); // [20, 5, 10]

        reqemler.add(0,22);
        System.out.println(reqemler); // [22, 20, 5, 10]



        List<Integer> elaveEdilecek = new ArrayList<>();
        elaveEdilecek.add(4);
        elaveEdilecek.add(7);
        // reqemler listinin sonuna (elaveedilecek) listi elave edin

        reqemler.addAll(elaveEdilecek); // 4 7
        System.out.println(reqemler); // [22, 20, 5, 10, 4, 7]


        //reqemler listini basinda 22 den sonraya elaveEDilecek Listi elave edin
        reqemler.addAll(1,elaveEdilecek);
        System.out.println(reqemler); // [22, 4, 7, 20, 5, 10, 4, 7]
    }
}
