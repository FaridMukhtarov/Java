package Lesson14_MethodCreation;

public class Method_String_TersCevirme {
    public static void main(String[] args) {

        // parametre olaraq bir String qebul edib
        // Stringin Terse cevrilmis halini donderen bir metod yarad

        String ters = "qerib";

        System.out.println(tersString(ters));
    }

    public static String tersString (String ters) {

        String tersInput = "";
        for (int i = ters.length() - 1; i >= 0; i--) {
            tersInput = tersInput+ters.charAt(i);
        }
        return tersInput;
    }
}
