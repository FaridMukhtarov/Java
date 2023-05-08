package lesson15_OverloadingAndWhileLoop;

import java.util.Scanner;

public class WhileLoop_2 {
    public static void main(String[] args) {

        /*
        istifadeciden toplama uzure tam sayialin
        istifadeci 0 basarsa sayi alma prisesini bitirin
        istifadecini neqeder reqem daxil etdiyini yazdirin
        ve uste gelmesini hesablayin
         */

        Scanner input = new Scanner(System.in);
        int daxilEdilenSayi = 5; // verilen ilk deyer 0 olmamalidr cunku 0 loop-i bitirecek

        int sayac = 0;
        int toplama = 0;

        while (daxilEdilenSayi != 0){
            System.out.println("Zehmet olmasa bir sayi daxil edin " +
                    "\n Bitirmek ucun 0-a basin");

            daxilEdilenSayi = input.nextInt();

            if (daxilEdilenSayi != 0){
                sayac++;
                toplama = toplama+daxilEdilenSayi;
            }
        }
        System.out.println("Daxil edilen " + sayac + " eded sayinin toplami " + toplama);

    }
}
