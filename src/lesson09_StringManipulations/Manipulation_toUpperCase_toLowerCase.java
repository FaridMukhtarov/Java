package lesson09_StringManipulations;

import java.util.Locale;

public class Manipulation_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str = "Java Happy";
        System.out.println(str.toUpperCase()); // JAVA HAPPY

        System.out.println(str); // Java Happy
        str = str.toUpperCase();
        System.out.println(str);

        str = "insan";
        str = str.toUpperCase();
        System.out.println(str);
        System.out.println(str.toLowerCase(Locale.forLanguageTag("az ")));

        System.out.println(str.toLowerCase(Locale.ITALIAN)); // insan

        str = str.toLowerCase();
        System.out.println(str);
    }
}
