package lesson41_Maps;

import java.util.ArrayList;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {


        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Bir", 1);
        treeMap.put("Iki", 2);
        treeMap.put("Uc", 3);
        treeMap.put("Dort", 4);
        treeMap.put("Bes", 5);


        ArrayList<String> strings = mapdenArray(treeMap);
        System.out.println(strings); // [Bes, Bir, Dort, Iki, Uc]

    }

    public static ArrayList<String> mapdenArray (TreeMap<String,Integer> treeMap){

        ArrayList<String> arrString = new ArrayList<>();
        for (String stringKey : treeMap.keySet()) {
              arrString.add(stringKey);
        }
        return arrString;
    }
}
