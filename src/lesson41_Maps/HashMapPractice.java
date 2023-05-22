package lesson41_Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {

        // bir map yaradarken ve element elave ederken
        // melumatlara sonradan elcatmagi mumkun olabilmesi ucun
        // butun elementlerin eyni melumatlari tutdugundan
        // ve eyni siralama ile element'e elave olundugundan emin olmaliyiq

        Map<Integer, String> person = new HashMap<>();
        person.put(101, " Ferid, Muxtarov, 28");
        person.put(102, " Fuad, Muxtarov, 27");
        person.put(103, " Ferahim, Muxtarov, 26");
        person.put(104, " Eldeniz, Mahmudov, 23");
        person.put(105, " Qerib, Mehdixanov, 25");

        System.out.println(person);
        System.out.println(person.size()); // 5
        System.out.println(person.keySet()); // [101, 102, 103, 104, 105]
        System.out.println(person.values()); // [ Ferid, Muxtarov, 28,  Fuad, Muxtarov, 27,  Ferahim, Muxtarov, 26,  Eldeniz, Mahmudov, 23,  Qerib, Mehdixanov, 25]
        System.out.println(person.values().size()); // 5
    }
}
