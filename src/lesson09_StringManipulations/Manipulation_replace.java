package lesson09_StringManipulations;

public class Manipulation_replace {
    public static void main(String[] args) {

        /*
        .replace Bir deyeri ve ya deyerde olan herif
         ve ya reqemi basqa bir deyerle deyismek ucundur
        */

        String str = "Java Candir";
        System.out.println(str.replace("a", "A")); // JAvA CAndir
        System.out.println(str.replace(" ", "_")); // Java_Candir
        System.out.println(str.replace("Candir","Gozeldir")); // Java Gozeldir
        System.out.println(str.replace(" ", "")); // JavaCandir

        // String-dek butun a-lar sil
        System.out.println(str.replace("a","")); // Jv Cndir

        // Jva yerine Hava, Candir yerine Cox Gozeldir yazdir
        System.out.println(str.replace("Java","Hava")
                .replace("Candir","Cox Gozeldir")); // Hava Cox Gozeldir
        System.out.println(str.replace("","_")); // _J_a_v_a_ _C_a_n_d_i_r_

        // Sadece birinci a-yi A ele
        System.out.println(str.replaceFirst("a","A")); // Birinci qeyd etdiyimiz Heerifi istesek Boyuk yada balaca eder (replaceFirst)

    }
}
