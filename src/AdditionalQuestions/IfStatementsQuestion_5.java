package AdditionalQuestions;

import java.util.Scanner;

public class IfStatementsQuestion_5 {
    public static void main(String[] args) {

        // İstifadəçidən xalini alın, 50 və ya daha çox olarsa
        // "Sinifi keçdin" və 50-dən azdırsa "Üzr istəyirik, qaldiniz" yazın.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa Xalinizi daxil edin: ");

        double xal = input.nextDouble();
        if (xal >= 50){
            System.out.println("Sinifi keçdin");
        }
        if (xal < 50){
            System.out.println("Üzr istəyirik, qaldiniz");
        }
    }
}
