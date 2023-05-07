package AdditionalQuestions;

import java.util.Scanner;

public class TernaryOperatorQuestion_2 {
    public static void main(String[] args) {

        // İstifadəçidən üçbucağın 3 tərəfli uzunluğunu alın,
        // əgər üçbucaq bərabərtərəflidirsə “Bərabər üçbucaq”,
        // əks halda “Bərabərtərəfli deyil” yazın.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa ucbucaqin 3 terefli uzunlugunu daxil edin: ");

        int kenar1 = input.nextInt();
        int kenar2 = input.nextInt();
        int kenar3 = input.nextInt();

        String ucBUcaq = kenar1 == kenar2 && kenar2 == kenar3 ? "Bərabər üçbucaq" : "Bərabərtərəfli deyil";
        System.out.println(ucBUcaq);
     }
}
