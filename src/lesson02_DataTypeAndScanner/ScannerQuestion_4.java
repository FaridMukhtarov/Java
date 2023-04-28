package lesson02_DataTypeAndScanner;

import java.util.Scanner;

public class ScannerQuestion_4 {
    public static void main(String[] args) {

        // İstifadəçinin adını, soyadını və yaşını alin və aşağıdakı formatda yazdirin.
        // Daxil edilmiş məlumat: J Doe, 44


        Scanner input = new Scanner(System.in);
        System.out.println("Zehmet olmasa adiniz, soyadinizi ve yasinizi daxil edin: ");

        String name = input.nextLine();
        String lastname = input.nextLine();
        int age = input.nextInt();

        System.out.println("Daxil edilmiş məlumat: "
                + name.substring(0,1).toUpperCase() + " "
                + lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase()
                + ", " + age);
    }
}
