package lesson09_StringManipulations;

public class Manipulation_length {
    public static void main(String[] args) {

        String str = "Dunyabirliyiheledebuedalesizliyedozur";
        System.out.println(str.length()); // 37

        System.out.println(str.charAt(36)); // r
        System.out.println(str.charAt(str.length()-1)); // Son index-deki herfi almag ucun (r)

        System.out.println(str.charAt(str.length()-3)); // Sondan 3-cu index-deki herfi almag ucun (z)
    }
}
