package lesson02_DataTypeAndScanner;

import java.util.Scanner;

public class ScannerQuestion_5 {
    public static void main(String[] args) {

        // İstifadəçidən iki ədəd alin və hər ikisinin dəyərlərini dəyişdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Zehmet olmasa iki eded daxil edin: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int bos = num1;
        num1 = num2;
        num2 = bos;

        System.out.println("Num1 " + num1 + " num2 " + num2);
    }
}
