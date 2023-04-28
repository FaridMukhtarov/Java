package lesson04_MathematicalIncrementDecrement;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {

        System.out.println(20 % 8); // 4

        System.out.println( 625872537 % 3); // eger netice 0 ise sayi 3'e tam bolunur

        // 12563412 sayisi 17'nin tam qatimidir ?

        System.out.println(12563412 % 17 ); // 4 demek ki tam qati dedil

        // istifadeciden bir pozitif tamsayi alib
        // birler basamaginin kvadiratini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zehmet olmasa bir pozitif tamsayi Daxil edin: ");
        int girilenSayi= scanner.nextInt();

        System.out.println(girilenSayi%10 * girilenSayi%10);

        // Daxil edilen sayidan birler basamagini silib qalan sayiyi yazdirin
        // meselem  213 daxil edildiyinde 21 yazdirsin

        System.out.println(girilenSayi / 10 ); // 213 / 10 ==> 21
    }
}
