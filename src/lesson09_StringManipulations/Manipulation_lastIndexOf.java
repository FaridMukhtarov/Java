package lesson09_StringManipulations;

public class Manipulation_lastIndexOf {
    public static void main(String[] args) {

        // (lastIndexOf) Tersden geriye sayir 10 - 1 ve ilk yazdigim ilk index-i verir
        String str = "Java yavasca cetinlesir";
        System.out.println(str.lastIndexOf("a")); // 11
        System.out.println(str.lastIndexOf('e')); // 19
        System.out.println(str.lastIndexOf("Java")); // 0 ilk yavanin ilk index-i
        System.out.println(str.lastIndexOf("j")); // -1
    }
}
