package lesson27_VarargsAndStringBuilder;

public class StringBuilder_2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Gozeldir");

        // .indexOf() istelinen herifin index-ni alir
        System.out.println(sb.indexOf("a")); // 1
        System.out.println(sb.indexOf("a",2)); // 3
    }
}
