package lesson08_TernaryOperatorAndSwitchCase;

import java.util.Scanner;

public class TernaryQuestion_6 {
    public static void main(String[] args) {

        // Istifadeciden notunu alin
        // 50 ve ya boyukse "Sinifi Kecdin" 50 den azsa "Tessufler olsun qaldiz" yazdir

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zehmet olmasa Notunuzu daxil edin: ");
        double not = scanner.nextDouble();

        String netice = not >= 50 ? "Sinifi Kecdin" : "Tessufler olsun qaldiz";
        System.out.println(netice);
    }
}
