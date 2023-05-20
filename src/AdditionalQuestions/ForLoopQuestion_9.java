package AdditionalQuestions;

import java.util.Scanner;

public class ForLoopQuestion_9 {
    public static void main(String[] args) {

        // (interview)- İstifadəçidən String tələb edin və Stringi tərsinə çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa ters cevirmek istediyiniz cumleni daxil edin: ");
        String cumle = input.nextLine();

        for (int i = cumle.length()-1; i >= 0; i--) {
            System.out.print(cumle.charAt(i));
        }
    }
}
