package lesson39_Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_01 {
    public static void main(String[] args) {

        LinkedList<String> linklist = new LinkedList<>();

        linklist.add("K");
        linklist.add("T");
        System.out.println(linklist); // [K, T]

        // LinkedList 3 interface-i implements etmisdir
        // List, Queue, Deque interfaceler-i
        // Buna görə də bu interface-lerden sonra gelen ilk concrete class oldugundan
        // Bu 3 interface-deki butun abstract method-lari override etmisdir

        // LinkedList yaradirken secilen data novune gore
        // bu 3 interface-den birinin xususiyetlerini alabilir
        // veya data novu LinkedList secilirse, 3 interface-in xusisiyetlerini de topdan alir

        List<String> list =new LinkedList<>();

        list.add("R"); // [R]
        list.add("Z"); // [R,A]
        list.add(0,"A"); // [A,R,Z]
        list.addAll(2, linklist); // [A,R,K,T,Z]
        list.set(3,"M"); // [A,R,K,M,Z]
        System.out.println(list.get(1)); // [R]

        list.add("K");
        list.add("T");
        System.out.println(list); // [A, R, K, M, Z, K, T]

        System.out.println(list.retainAll(linklist)); // true

        System.out.println(list); //  [K, K, T]
        list.add("A");
        System.out.println(list.hashCode()); // 3232590  [K, K, T, A]

        System.out.println(list.subList(2,4)); // 2 daxil, 4 daxil olmadigindan exception firlatmaz
    }
}
