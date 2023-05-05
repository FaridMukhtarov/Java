package AdditionalQuestions;

import java.util.Scanner;

public class IfElseStatementsQuestion_4 {
    public static void main(String[] args) {

        // İstifadəçidən herif daxil etməyi xahiş edin,
        // daxil edilmiş herifin böyük hərf olub-olmadığını çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir herif daxil edin: ");
        char herif = input.next().charAt(0);

        if (herif >= 'A' && herif <= 'Z'){
            System.out.println("Daxil etdiyiniuz herif boyuk herifdir: " + herif);
        }else
            System.out.println("Daxil etdiyiniuz herif kicik herifdir: " + herif);
    }
}
