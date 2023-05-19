package AdditionalQuestions;

import java.util.Scanner;

public class ForLoopQuestion_7 {
    public static void main(String[] args) {

        // İstifadəçidən müsbət tam ədəd alın və rəqəmlərin cəmini çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa pozitiv bir sayi daxil edin: ");
        int sayi = input.nextInt();
        String reqemler = String.valueOf(sayi);

        int birler = 0;
        int reqemlerToplami = 0;

        for (int i = 1; i <= reqemler.length(); i++) {

             birler = sayi % 10;
             reqemlerToplami += birler;
             sayi = sayi / 10;
        }
        System.out.println(reqemlerToplami);
    }
}
