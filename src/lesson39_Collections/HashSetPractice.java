package lesson39_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {

        // Java-da "HashSet" unikal elementləri saxlamaq üçün istifadə edilən data strukturudur.
        // HashSet, Set interfeysini həyata keçirən java.util paketində sinifdir. Bu sinif kolleksiyadakı
        // elementlərin sırasına zəmanət vermir və elementin yalnız bir dəfə saxlanıla biləcəyi məlumat strukturunu təmin edir.

        // HashSet elementlərin unikal olmasını təmin etmək üçün hashCode() və equals() metodlarından istifadə edir.
        // Elementin unikallığı hashCode() metodu ilə yoxlanılır və eyni hashCode olan elementlər equals() metodu ilə müqayisə edilir.

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Ferid");
        hashSet.add("Fuad");
        hashSet.add("Eldeniz");
        hashSet.add("Ferahim");
        hashSet.add(null);

        System.out.println(hashSet.size()); // 5
        System.out.println(hashSet.hashCode()); // 771199029
        System.out.println(hashSet.isEmpty()); // false
        System.out.println(hashSet.contains("Eldeniz")); // true
        System.out.println(hashSet.remove("Ferid")); // true
        // hashSet.clear();
        System.out.println(hashSet.clone()); // [null, Fuad, Eldeniz, Ferahim]
        System.out.println(Arrays.toString(hashSet.toArray())); // [null, Fuad, Eldeniz, Ferahim]


        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(6);
        integerHashSet.add(8);
        integerHashSet.add(2);
        integerHashSet.add(1);
        integerHashSet.add(9);
        integerHashSet.add(5);

        for (Integer integer : integerHashSet) {
            System.out.println(integer);
        }

    }
}
