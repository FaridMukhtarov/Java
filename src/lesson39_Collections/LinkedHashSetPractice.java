package lesson39_Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

        // Java-da "LinkedHashSet" elementləri əlavə olunduğu ardıcıllıqla saxlayan data strukturudur.
        // LinkedHashSet class-i java.util paketinə daxil olan HashSet class-inin alt class-idir. Bu class elementləri
        // HashSet-in xussiyetlerine əlavə olaraq, əlavə olunduğu data-lari ardıcıllıqla saxlayır.

        // LinkedHashSet həm Set interfeysini, həm də LinkedHashMap sinifinin xüsusiyyətlərini birləşdirir.
        // Buna görə də, o, elementi əlavə edərkən və silərkən sürətli çıxışı təmin edir və
        // həmçinin elementlərin əlavə olunma qaydasını saxlayır.

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(6);
        linkedHashSet.add(4);
        linkedHashSet.add(1);
        linkedHashSet.add(0);
        linkedHashSet.add(7);
        linkedHashSet.add(3);

        Iterator<Integer> iterator = linkedHashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
