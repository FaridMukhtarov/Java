package AdditionalQuestions;

import java.util.Scanner;

public class TernaryOperatorQuestion_6 {
    public static void main(String[] args) {

        // İstifadəçidən nömrə alın və onun mütləq dəyərini çap edin
        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir neqatif sayi daxil edin: ");
        int sayi = input.nextInt();

        int netice = sayi > 0 ? sayi : sayi * -1;
        System.out.println(netice);
    }
}
