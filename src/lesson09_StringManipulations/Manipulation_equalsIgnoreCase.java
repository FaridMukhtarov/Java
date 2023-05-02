package lesson09_StringManipulations;

public class Manipulation_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Ferid";
        String str2 = "ferid";
        String str3 = "FERID";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equalsIgnoreCase("ferid")); // true
    }
}
