package lesson09_StringManipulations;

public class Manipulation_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";
        System.out.println(str.charAt(0)); // Ilk index-deki Herifi Verir (J)
        System.out.println(str.charAt(5)); // 5-ci index-deki Herifi Verir (C)
        System.out.println(str.charAt(10)); // Sonuncu index-deki Herifi Verir (r)
        System.out.println(str.charAt(str.length()-1)); // r

        // System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException
    }
}
