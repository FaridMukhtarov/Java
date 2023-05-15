package lesson27_VarargsAndStringBuilder;

public class StringBuilder_3 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Candir");

        System.out.println(sb.reverse()); // ridnaC avaJ
        System.out.println("Ters yazdirdiqdan sonra: " + sb); // ridnaC avaJ

        sb.insert(0,".");
        System.out.println(sb); // .ridnaC avaJ

        sb.reverse();

        StringBuilder sb1 = new StringBuilder("Java Candir.");
        String str = "Java Candir.";

        // == ile
        System.out.println(sb == sb1); // false, ici eyni olsa bele false verir
        System.out.println(sb == sb); // true, sadece bir sb ozuyle qarsilasdirlarsa true verir
        // System.out.println(sb == str); // ferqli iki data novu == ile qarsilasdirilamaz CTE verir

        // .equals() ile
        System.out.println(sb.equals(sb1)); // false, ici eyni olsa bele false verir
        System.out.println(sb.equals(sb)); // true, sadece bir sb ozuyle qarsilasdirlarsa true verir
        System.out.println(sb.equals(str)); // false CTE vermez ancaq netice her zaman false'dur

        // .compareTo()
        System.out.println(sb.compareTo(sb1)); // 0
        StringBuilder sb3 = new StringBuilder("Java Candir");
        System.out.println(sb.compareTo(sb3)); // 1

        /*
          CompareTo tamamilə yalnız eyni və ya fərqli cavabını verir.
          hamisi eyni olarsa ==> 0 qaytarır
          fərq varsa ==> ilk fərqli hərfi tapdıqda fərqli hərflər arasındakı hərflərin sayını qaytarır
        */
    }
}
