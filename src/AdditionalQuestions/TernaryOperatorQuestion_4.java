package AdditionalQuestions;

import java.util.Scanner;

public class TernaryOperatorQuestion_4 {
    public static void main(String[] args) {

        // İstifadəçidən xalini alın, 50 və ya daha çox olarsa
        // "Sinifi keçdin" və 50-dən azdırsa "Üzr istəyirik, uğursuz" yazın.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa topladiginiz xali daxil edin: ");
        double xal = input.nextDouble();

        String netice = xal >= 50 ? "Sinifi keçdin" : "Üzr istəyirik, uğursuz";
        System.out.println(netice);
    }
}
