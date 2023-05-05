package AdditionalQuestions;

import java.util.Scanner;

public class DataCastingQuestion_3 {
    public static void main(String[] args) {

        // İstifadəçidən reqem alın, istifadəçi nə daxil etsə də, -128 ve
        // 127 arasındakı rəqəmə çevirin və çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir sayi daxil edin: ");

        int daxilOLan = input.nextInt();
        byte ceviren = (byte) daxilOLan;

        System.out.println("Sizin daxil etdiyiniz sayi: " + daxilOLan
                + ". Sistemin cevirdyi sayi: " + ceviren + ".");
    }
}
