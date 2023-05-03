package lesson09_StringManipulations;

public class Manipulation_startsWith {
    public static void main(String[] args) {


        //  startsWith  (String prefix) 1-ci istifade qaydasi
        String str = "Java bele oyrenilmez";

        System.out.println(str.startsWith("java")); // false
        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java bele oyrenilmez")); // true
        System.out.println(str.startsWith("")); // true

        // startsWith (String prefix, int toffset) 2-ci istifade qaydasi
        System.out.println(str.startsWith("bele", 5)); // true
        System.out.println(str.startsWith("Java", 0)); // true
        System.out.println(str.startsWith("java", 10)); // false
        System.out.println(str.startsWith(" ",9)); // true
    }
}
