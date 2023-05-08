package Lesson14_MethodCreation;

public class Method_StringConcat {
    public static void main(String[] args) {

        // verilen iki Stringi parametre olaraq qebul edib
        // bu iki String-in aralarinda bosluq olan bir String
        // olaraq main method=da dondur

        String str1 = "Java";
        String str2 = "Gozeldir";

        String netice = concatMethod(str1,str2);
        System.out.println(netice);
        System.out.println(concatMethod("Farid","Mukhtarov"));
    }
    public static String concatMethod (String str1, String str2){
        return str1+ " " +str2;

    }
}
