package lesson39_Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {

        // Java-da "TreeSet" sirali bir kume (set) data strukturudur.
        // TreeSet SortedSet interfeysini və java.util paketinə daxil olan NavigableSet interfeysini həyata keçirir.
        // Bu sınıf, elementleri doğal sıralama veya belirtilen bir Comparator tarafından sağlanan sıralama kriterine göre tutar.

        // TreeSet qırmızı-qara ağac quruluşuna əsaslanır. Elementlər əlavə olunduqca avtomatik olaraq çeşidlənir
        // və daxiletmə, silmə və axtarış əməliyyatları O(log n) mürəkkəbliyi ilə yerinə yetirilir.
        // Buna görə də, elementlərin ardıcıl saxlanmasını tələb edən vəziyyətlərdə TreeSet-ə üstünlük verilir.


        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Ferid");
        treeSet.add("Fuad");
        treeSet.add("Ferahim");
        treeSet.add("Eldeniz");
        treeSet.add("Qarib");
        treeSet.add("Nurlan");

        System.out.println(treeSet);




    }
}
