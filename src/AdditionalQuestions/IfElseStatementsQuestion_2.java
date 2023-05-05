package AdditionalQuestions;

import java.util.Scanner;

public class IfElseStatementsQuestion_2 {
    public static void main(String[] args) {

        // İstifadəçidən xalini alın, 50 və ya daha çox olarsa
        // "Sinifi keçdin" və 50-dən azdırsa "Üzr istəyirik, uğursuz" yazın.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa topladiginiz xali qeyyd edin: ");

        double xal = input.nextDouble();
        if (xal >= 50){
            System.out.println("Sinifi keçdin");
        }else
            System.out.println("Üzr istəyirik, uğursuz");
    }
}
