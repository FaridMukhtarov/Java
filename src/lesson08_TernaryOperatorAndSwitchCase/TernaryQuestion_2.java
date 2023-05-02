package lesson08_TernaryOperatorAndSwitchCase;

public class TernaryQuestion_2 {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";

        // verilen iki metin bir biri ile berabedirse metinler eyni
        // ferqli ise metinler ayri yazdir

        if (str1.equals(str2)){
            System.out.println("Metinler eynidir");
        }else {
            System.out.println("Metinler ferqlidir");
        }

        System.out.println(str1.equals(str2) ? "Metinler eynidir" : "Metinler ferqlidir");
    }
}
