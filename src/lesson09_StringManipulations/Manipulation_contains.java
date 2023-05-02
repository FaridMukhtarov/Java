package lesson09_StringManipulations;

public class Manipulation_contains {
    public static void main(String[] args) {

        String str = "Java ile kodlama maraglidir";

        System.out.println(str.contains("odla")); // true

        System.out.println(str.contains("a")); // true

        // System.out.println(str.contains('a')); // char qebul elemir

        System.out.println(str.contains("java")); // false

        String str2 = "Java";
        System.out.println(str.contains(str2)); // true
    }
}
