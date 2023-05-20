package AdditionalQuestions;

import java.util.Scanner;

public class ForLoopQuestion_10 {
    public static void main(String[] args) {

        // (interview)- İstifadəçidən String tələb edin və Stringi tərsinə çevirin
        // bunu yadda saxla.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa ters cevirmek istediyiniz cumleni daxil edin: ");
        String cumle = input.nextLine();
        StringBuilder ters = new StringBuilder();

        for (int i = cumle.length()-1; i >= 0; i--) {
            ters.append(cumle.charAt(i));
        }
        System.out.println(ters);
    }
}
