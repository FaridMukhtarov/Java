package lesson09_StringManipulations;

public class Manipulation_trim {
    public static void main(String[] args) {

        // (.trim) sadece basdaki ve sondaki bosluqlari silir
        String str = "   Java Gozeldir  ";
        System.out.println(str.length());
        str = str.trim();
        System.out.println(str.length());
    }
}
