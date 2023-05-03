package lesson09_StringManipulations;

public class Manipulation_endsWith {
    public static void main(String[] args) {

        String str = "Java her yerde gozeldir";
        System.out.println(str.endsWith("gozeldir")); // true
        System.out.println(str.endsWith("r")); // true
        System.out.println(str.endsWith("")); // true
        System.out.println(str.endsWith("Java her yerde gozeldir")); // true
        System.out.println(str.endsWith("f")); // false
    }
}
