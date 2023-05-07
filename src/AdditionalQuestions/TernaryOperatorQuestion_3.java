package AdditionalQuestions;

import java.util.Scanner;

public class TernaryOperatorQuestion_3 {
    public static void main(String[] args) {

        // İstifadəçidən hərf istəyin, əgər daxil edilmiş simvol kiçik hərfdirsə,
        // onu böyük hərflə çap edin, əks halda daxil edilmiş hərfi çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir herif daxil edin: ");

        char herif = input.next().charAt(0);

        System.out.println(herif >= 'a' && herif <= 'z' ? (char) (herif-32) : herif);
    }
}
