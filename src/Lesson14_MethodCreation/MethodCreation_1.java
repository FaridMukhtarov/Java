package Lesson14_MethodCreation;

public class MethodCreation_1 {
    public static void main(String[] args) {

        String str = "Java Gozeldir";
        // Cumleni Boyuk herif cevirin

        System.out.println(str); // Boyuk yaziya cevrilmez cunku varible elave etmedik

        String bokukStr =  str.toUpperCase();

        System.out.println(bokukStr); // JAVA GOZELDIR

        // metini boyuk heriflere cevrilmis halli D varmi
        System.out.println(bokukStr.contains("D")); // true
    }
}
