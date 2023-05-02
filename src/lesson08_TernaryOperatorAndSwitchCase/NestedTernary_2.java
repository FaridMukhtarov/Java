package lesson08_TernaryOperatorAndSwitchCase;

import java.util.Scanner;

public class NestedTernary_2 {
    public static void main(String[] args) {

        // Istifadeciden bir tam reqem alin
        // Reqem pozitifse, cut reqem veya tek reqem secimlerinden birini yazdir
        // reqem pozitif deyilse, 3 basamaqli ve ya 3 basamaqli deyil secimlerinden birini yazdir

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir Reqem daxil edin: ");

        int reqem = scanner.nextInt();

        String netice = reqem > 0
                ? reqem % 2 == 0 ? "Cut reqem" : "Tek Reqem"
                : reqem >=  -999 && reqem <= -100 ? "3 Basamaqli reqem" : "3 Basamaqli reqem deyil";

        System.out.println(netice);
    }
}
