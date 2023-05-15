package lesson26_ImmutableClassesAndDateAndTime;

public class ImmutableString {
    public static void main(String[] args) {

        /*
        Immutable class'lardan yaradilan bir obyekt deyeri DEYISTIRILMEZ
        Eger atama edersek java deyerini deyistirmez
        bunun yerine yeni bir obyekt yaradar,
        ve bu yeni obyecte yeni atadiginiz deyeri atar
        kohne obyekt bos olar ve garbage collector terefinden silinmeyi gozleyer
         */

        String str = "Java Gozeldir";
        str = str.toUpperCase();
        System.out.println(str); // JAVA GOZELDIR
    }
}
