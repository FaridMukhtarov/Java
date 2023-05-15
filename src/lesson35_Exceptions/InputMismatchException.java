package lesson35_Exceptions;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {

        // Istifadeciden  bir tamsayi alib
        // o sayinin karesini yazdiran
        // istifadeci ondalikli sayi girerse istifadeciye xeberdarliq yazisi yazdirip
        // tekrar sayi isteyen bir method olusturun

        sayiAlKaresiniYazdir();
    }

    private static void sayiAlKaresiniYazdir() {
        Scanner input = new Scanner(System.in);

        try {
            int reqem = input.nextInt();

             /*
                Eger ondalikli sayi girilirse 21.setir exception verecek ve
                catch bloguna qeder olan diger kodlar islemeyeck
                catch blogu sehv tapdiginda ne etmesini  istediyimizi dediyimiz bolumdur
                bu sualda istelinen exception yaradildiginda yeniden deyer istenmesi
                biz de exception yaradildiginda  yeniden method'u isletdik
                sehv olmazsa catch bloku islemez ve kod normal bir sekilde biter
             */

            System.out.print("Daxil edilen reqemin karesi: ");
            System.out.println(reqem * reqem);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Tam sayi deyeri gir dedik :) ");
            sayiAlKaresiniYazdir();
        }
    }
}
