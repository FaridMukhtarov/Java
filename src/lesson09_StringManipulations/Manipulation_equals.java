package lesson09_StringManipulations;

public class Manipulation_equals {
    public static void main(String[] args) {

        String str1 = "Ferid";
        String str2 = "farid";

        String str3 = new String("Ferid");

        System.out.println(str1==str2); // False
        System.out.println(str1==str3); // False

        System.out.println(str1.equals(str2)); // False
        System.out.println(str1.equals(str3)); // True
    }
}
