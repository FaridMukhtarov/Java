package lesson08_TernaryOperatorAndSwitchCase;

import java.util.Scanner;

public class TernaryQuestion_7 {
    public static void main(String[] args) {

        // Istifadeciden bir reqem alin ve mutleq deyerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir reqem daxil edin: ");
        double reqem = scanner.nextDouble();

        double netice =  reqem > 0 ? reqem : reqem * -1;
        System.out.println(netice);
    }
}
