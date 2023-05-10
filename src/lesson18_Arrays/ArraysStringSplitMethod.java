package lesson18_Arrays;

import java.util.Arrays;

public class ArraysStringSplitMethod {
    public static void main(String[] args) {

        String kesme = "Java Gozeldir, Ve Oyrenecem";

        String[] jGozel = kesme.split("Ve");
        System.out.println(Arrays.toString(jGozel)); // [Java Gozeldir ,  Oyrenecem]

        String[] vegulBosluq = kesme.split("Ve Oyrenecem");
        System.out.println(Arrays.toString(vegulBosluq)); // [Java Gozeldir, ]

        String[] gOyrenecem = kesme.split("G");
        System.out.println(Arrays.toString(gOyrenecem)); // [Java , ozeldir, Ve Oyrenecem]

        String[] heclik = kesme.split("");
        System.out.println(Arrays.toString(heclik)); // [J, a, v, a,  , G, o, z, e, l, d, i, r, ,,  , V, e,  , O, y, r, e, n, e, c, e, m]
    }
}
