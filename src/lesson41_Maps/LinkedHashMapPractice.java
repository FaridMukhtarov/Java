package lesson41_Maps;

import java.util.*;

public class LinkedHashMapPractice {
    public static void main(String[] args) {


        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("az", "azerbaycan");
        linkedHashMap.put("tr", "Turkiye");
        linkedHashMap.put("gr", "Almaniya");
        linkedHashMap.put("ru", "Russiya");
        linkedHashMap.put("uk", "Ukraina");

        System.out.println(linkedHashMap.get("gr")); // Almaniya
        System.out.println(linkedHashMap.keySet()); // [az, tr, gr, ru, uk]
        System.out.println(linkedHashMap.containsValue("azerbaycan")); // true
        System.out.println(linkedHashMap.containsKey("az")); // true
        System.out.println(linkedHashMap.replace("az","albnia"));
        System.out.println(linkedHashMap.values()); // [albnia, Turkiye, Almaniya, Russiya, Ukraina]

        List<String> array = new ArrayList<>();
        String[] arr = new String[linkedHashMap.keySet().size()];


        for (String each : linkedHashMap.values()) {
            array.add(each);
        }
        System.out.println(array); // [albnia, Turkiye, Almaniya, Russiya, Ukraina]


        for (String each : linkedHashMap.keySet()){
            arr = linkedHashMap.keySet().toArray(new String[0]);
        }
        System.out.println(Arrays.toString(arr)); // [az, tr, gr, ru, uk]

    }
}
