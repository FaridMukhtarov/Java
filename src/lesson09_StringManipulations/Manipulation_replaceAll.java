package lesson09_StringManipulations;

public class Manipulation_replaceAll {
    public static void main(String[] args) {

        String str = "J1ava9 G5o9z7el6dir";
        // str-daki reqemleri silib cumlen Java Gozeldir hallina getir
        // str.replaceAll()
        System.out.println(str.replaceAll("\\d", "")); // Java Gozeldir
        System.out.println(str.replaceAll("\\D", "")); // 195976
        System.out.println(str.replaceAll("\\w", "")); // Heclik
        System.out.println(str.replaceAll("\\s", "")); // J1ava9G5o9z7el6dir
        System.out.println(str.replaceAll("\\s", "") // JavaGozeldir
                .replaceAll("\\d", ""));

        String str1 = "Birinci mesul qiymeti : 1250 Manat";
        String str2 = "Ikinci mesul qiymeti : 1500 Manat";
        // iki mesulun qiymetini topla
        str1 = str1.replaceAll("\\D", "");
        str2 = str2.replaceAll("\\D", "");
        System.out.println((str1 + str2)); // "12501500"
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 2750


        /*
        Regex (Regular Expressions)
        \\s : Space-leri silir
        \\s+: Yanyana birden cok space-i
        \\d : digits olan herseyi
        \\w : herif ve reqem olan herseyi
        \\S : Space olmayan herseyi
        \\D : Digit olmayan herseyi
        \\W : Herif ve reqem olmayan herseyi
         */
    }
}
