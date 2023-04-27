package lesson02_DataTypeAndScanner;

import java.util.Scanner;

public class ScannerQuestion_3 {
    public static void main(String[] args) {

        // Istifadeciden adini, familyasini, ve yasini alib, asagidaki formada yazdirin
        // Adiniz: Farid
        // Familyaniz: Mukhtarov
        // Yasiniz: 28
        // Qeydiyyatiniz ugurla tamalandi.

        Scanner input = new Scanner(System.in);

        System.out.print("Adinizi daxil edin: ");
        String ad = input.nextLine();

        System.out.print("Familayizi daxil edin: ");
        String familya = input.nextLine();

        System.out.print("Yasinizi daxil edin: ");
        int yas = input.nextInt();

        System.out.println("Adiniz: " + ad
                            + "\nFamilayniz: " + familya
                            + "\nYasiniz: " + yas
                            + "\nQeydiyyatiniz ugurla tamalandi.");

    }
}
