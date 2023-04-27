package lesson02_DataTypeAndScanner;

import java.util.Scanner;

public class ScannerObject {
    public static void main(String[] args) {

        // Istifadeciden bir tam sayi isteyib
        // daxil edilen sayinin iki qatini yazdir

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir tam reqem saxil edin: ");
        int istifadeci = input.nextInt();

        System.out.print("Daxil etdilen reqemin iki qati: " + istifadeci * 2);
    }
}
