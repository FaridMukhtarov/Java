package AdditionalQuestions;

import java.util.Scanner;

public class IfElseStatementsQuestion_5 {
    public static void main(String[] args) {

        // İstifadəçidən hərf istəyin, əgər daxil edilmiş
        // kiçik hərfdirsə, onu böyük hərflə çap edin,
        // əks halda daxil edilmiş hərfi çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir herif daxil edin: ");

        char herif = input.next().charAt(0);
        if (herif >= 'a' && herif <= 'z'){
            System.out.println("Daxil edilen herif sistem terefinden boyudulmusdur: " + (char)(herif-32));
        }else
            System.out.println("Daxil etdiyiniz herif: " + herif);
    }
}
