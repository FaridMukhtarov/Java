package lesson08_TernaryOperatorAndSwitchCase;

public class TernaryQuestion_3 {
    public static void main(String[] args) {

        // Ternary Operator tek istifade  edile bilmez
        // neticesi yazdirilmali yada bir Variable elave etmaliyik

        int a = 5;


        // Ternary - neticesini bir Variable elave edeceyikse
        // data novunun her ikiside uygun olmalidir
        // yoxsa sout icinde isdifade etmek olar

        // codun altinda qirmizi cizgi olarsa java dilinde CTE- compail time error

        // eyni deyere sahib variable (String)
        String netice = a%2==0 ? "Cut Reqem" : "Tek Reqem";

        // eyni deyere sahib variable (Int)
        a = a>10 ? a*2 : a/2;

        // ferqli data novune sahib ancaq sout icinde
        System.out.println(a>10 ? "Boyuk Reqem" : 2*a);
    }
}
