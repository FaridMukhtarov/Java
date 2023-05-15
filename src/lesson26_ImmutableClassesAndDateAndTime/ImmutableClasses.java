package lesson26_ImmutableClassesAndDateAndTime;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClasses {
    public static void main(String[] args) {

        // Java'da "immutable class" (deyişmez sinif) bir Class-dir ki,
        // obyektlərin özellikleri yaratildiqdan sonra deyiştirilemez.
        // Bu cur Class-lar, Tətbiqin təhlükəsizliyini artırır ve programlama
        // səhvlərini qarşısını alır, çünki dəyişdirilməsi lazım olan dəyərlərin nüsxələri yaradılır.
        // Məsələn, String class-i Java-da immutable class-dir,
        // ona görə də String obyektinin dəyərləri dəyişdirilə bilməz.

        // Mutable
        // 1- List
        // 2- Arrays

        // Immutable
        // 1- String


        // String immutable oldugu ucun, method ile edilen deyisikler String'i qalici deyistirmez
        String str = "Java Gozeldir";
        System.out.println(str.toUpperCase()); // JAVA GOZELDIR
        System.out.println(str); // Java Gozeldir

        str.toLowerCase();
        System.out.println(str); // Java Gozeldir



        // List ve Array mutable olduqlari icin method ile edilen deyisiklikler qalici olur
        List<String> herifler = new ArrayList<>();
        herifler.add("A");
        herifler.add("B");

        herifler.remove(0);
        System.out.println(herifler); // [B]
    }
}
