package lesson39_Collections;

import lesson30_inheritance.Masin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MixSet {
    public static void main(String[] args) {

        // Əgər data növü kimi obyekt seçilibsə, ona istənilən data tipi elementi yerləşdirilə bilər
        // Bununla belə, elementlərə daxil olmaq və ya yeniləmək lazımdır.
        // mümkün olmaya bilər və ya çox çətin ola bilər

        // Collections objeleri birararda tutan yapılardır.
        Set<Object> mixSet = new HashSet<>();

        mixSet.add("Ferid");
        mixSet.add(28);
        mixSet.add('h');
        mixSet.add(true);
        mixSet.add(false);

        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 3;

        mixSet.add(arr);

        System.out.println();
    }
}
