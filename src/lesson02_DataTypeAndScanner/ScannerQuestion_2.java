package lesson02_DataTypeAndScanner;

import java.util.Scanner;

public class ScannerQuestion_2 {
    public static void main(String[] args) {

        // istifadeciden bir double, bir de int reqemi alib
        // bunlarin cemini ve vurmasini yazdirin

        Scanner input = new Scanner(System.in);

        System.out.print("Zehmet Olmasa bir ondaliqli Reqem daxil edin: ");
        double ondaliq = input.nextDouble();

        System.out.print("Zehmet Olmasa bir tam Reqem daxil edin: ");
        int tam = input.nextInt();

        System.out.println("Daxil edilen sayilarin cemi: " + (tam + ondaliq)
                           + "\nDaxil edilen sayilrin vurmasi: " + (tam * ondaliq));


    }
}
