package AdditionalQuestions;

import java.util.Scanner;

public class TernaryOperatorQuestion_1 {
    public static void main(String[] args) {

        // İstifadəçidən sayi istəyin, sayini yoxlayın
        // və 5-ə bölünürsə, "sayi 5-ə qat" yazısını çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir sayi daxil edin: ");

        int sayi = input.nextInt();
        String bolmeYoxlama = sayi % 5 == 0 ? "Sayi 5-ə qat" : "Sayi 5-e bolunmur";
        System.out.println(bolmeYoxlama);
    }
}
