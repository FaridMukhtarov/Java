package lesson15_OverloadingAndWhileLoop;

import java.util.Scanner;

public class WhileLoop_3 {
    public static void main(String[] args) {

        /*
        istigfadeciden toplanmaq uzure sayi alin
        sayilarin toplami 500-e olursa ve ya kecerse
        daxil edilen sayilarin  ededi ve toplmamalrini yazdir
        "Bu qeder besdir:"
         */

        Scanner input = new Scanner(System.in);

        double daxilEdilenSayi = 0;
        double toplama = 0;
        int sayac = 0;

        while (toplama<500){
            System.out.print("Toplamaq ucun sayi daxil edin: ");
            daxilEdilenSayi = input.nextDouble();
            toplama+=daxilEdilenSayi;
            sayac++;
        }

        System.out.println("Daxil edilen " +sayac+" sayinin toplamasi " +toplama+" oldu 'Bu qeder besdir'");
    }
}
