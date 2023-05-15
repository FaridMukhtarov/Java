package lesson27_VarargsAndStringBuilder;

public class StringBuilderIntroduction {
    public static void main(String[] args) {

        // Java dilində StringBuilder Class-i sətir dəyişdirmə əməliyyatları üçün optimallaşdırılmış Class-dir.
        // String obyektləri immutable olduğundan, sətri dəyişmək hər dəfə yeni sətir yaratmağı tələb edir.
        // Bununla belə, StringBuilder Class-indan istifadə edərək mövcud sətirdə dəyişikliklər edilə bilər.
        // Bu class sətirdəki simvolların dəyişdirilməsi, əlavə edilməsi və ya silinməsi kimi əməliyyatları optimallaşdırır və sürətləndirir.

        // StringBuilder .replace() method  (Bezi yeri deyisdirmek)
        // StringBuilder .delete() method   (Bezi yeri silmek)
        // StringBuilder .reverse() method  (Stringi Terse cevirmek)
        // StringBuilder .capacity() method (Stringin tutumunu yoxlmaq)

        StringBuilder ab = new StringBuilder("Hello");
        ab.append(" ");
        ab.append("World");
        System.out.println(ab); // Hello World

        StringBuilder sb = new StringBuilder(7);
        System.out.println(sb.capacity()); // 7
        System.out.println(sb.length()); // 0 hec deyer elave etmediyimiz ucun

        sb.append("Java");
        System.out.println(sb.capacity()); // 7
        System.out.println(sb.length()); // 4

        sb.append(" Gozeldir.");
        System.out.println(sb); // Java Gozeldir.
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 14

        sb.append(" elbetde bilirem.");
        System.out.println(sb); // Java Gozeldir. elbetde bilirem.
        System.out.println(sb.capacity()); // 34
        System.out.println(sb.length()); // 31

        // capacity ve length beraberlemek istersek
        sb.trimToSize();
        System.out.println(sb.capacity()); // 31
        System.out.println(sb.length()); // 31

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ferid");
        System.out.println(stringBuilder.reverse());

    }
}
