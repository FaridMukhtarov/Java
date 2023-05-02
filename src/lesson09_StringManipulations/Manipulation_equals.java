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

        // Normalda non-Primitive data novleri object-ler new keword-u ile yaradilir

        // equals methodu sadece deyerlere baxar
        // == ise hem deyerlere hemde referanslara baxar
    }
}
