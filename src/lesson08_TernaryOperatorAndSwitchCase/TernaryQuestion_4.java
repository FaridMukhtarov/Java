package lesson08_TernaryOperatorAndSwitchCase;

import java.util.Scanner;

public class TernaryQuestion_4 {
    public static void main(String[] args) {

        // Istifadeciden bir Ucbucaqin  3 kenar uzunlugunu al
        // eger ucbucaq kenarlar berabedirse "Beraberdir" yazdir
        // yox eger deyilse "Beraber deyil" yazdir

        Scanner input = new Scanner(System.in);
        System.out.println("Zhmet Olmasa Ucbucaqin kenarini daxil edin:");
        int kenar1 = input.nextInt();
        int kenar2 = input.nextInt();
        int kenar3 = input.nextInt();

        String netice = kenar1==kenar2 && kenar2==kenar3 ? "Beraberdir" : "Beraber Deyil";
        System.out.println(netice);
    }
}
