package lesson02_DataTypeAndScanner;

import java.util.Scanner;

public class ScannerQuestion_6 {
    public static void main(String[] args) {

        // İstifadəçidən iki ədədin alin və üçüncü dəyişəndən istifadə etmədən
        // hər ikisinin dəyərlərini dəyişdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Zehmet olmasa iki eded daxil edin:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Num1 " + num1 + " num2 " + num2);
    }
}
