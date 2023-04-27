package lesson02_DataTypeAndScanner;

import java.util.Scanner;

public class ScannerQuestion_1 {
    public static void main(String[] args) {

        // Istifadeciden adini isteyib
        // adi boyuk herife cevirib yada saxlayib
        // sonra istifadeciye yeni halini yaz

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa adinizi qeyd edin: ");
        String yeniAd = input.nextLine();
        yeniAd = yeniAd.toUpperCase();
        System.out.print("Sizin Yeni adiniz: " + yeniAd);

    }
}
