package lesson27_VarargsAndStringBuilder;

public class StringBuilder_1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Candir.");

        System.out.println(sb.capacity()); // 28
        System.out.println(sb.length()); // 12

        // .revers() String-i tersden yazdirir
        System.out.println(sb.reverse()); // .ridnaC avaJ
        sb.reverse(); // Java Candir.

        // .replace() String-in istelinen qismini deysimek ucun
        sb.replace(5,11, "Gozeldir");
        System.out.println(sb); // Java Gozeldir.

        // .insert() String-e elave etmek
        System.out.println(sb.insert(13, " ve Candir")); // Java Gozeldir ve Candir.

        String str = "Heyacandir ";
        System.out.println(sb.insert(14, str)); // Java Gozeldir Heyacandir ve Candir.
    }
}
