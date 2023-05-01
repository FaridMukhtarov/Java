package lesson06_ifElseStatements;

import java.util.Scanner;

public class IfElse_Statements_4 {
    public static void main(String[] args) {

        // Istifadeciden bir herif yazmasini itemey
        // ve bu herifin kicikse ekrana boyuk yazdirmagimizi lazimdir

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir karakter daxil edin: ");

        Character ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.print("Daxil edilen Kicik Herifin yeni halli: " + Character.toUpperCase(ch)); // Buda basqa bir yontem (Character.toUpperCase(ch))
                                                 // Boyuk herifle kicik  herif arasinda 32 herif ferqi var ona gor
                                                 // kicik herif ucun -32 ve cast etmek ucun (Char)  (char) (ch-32)
        }else {
            System.out.println(ch);
        }
    }
}
