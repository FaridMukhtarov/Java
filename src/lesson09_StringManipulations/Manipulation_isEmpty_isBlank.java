package lesson09_StringManipulations;

public class Manipulation_isEmpty_isBlank {
    public static void main(String[] args) {

        String str = "";
        System.out.println(str.isEmpty()); // true

        str  = " ";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // true

        str = "Java";
        System.out.println(str.isEmpty()); // false (isEmpty Bosdurmu?)
        System.out.println(str.isBlank()); // false (isBlank Boslukdurmu?)
    }
}
