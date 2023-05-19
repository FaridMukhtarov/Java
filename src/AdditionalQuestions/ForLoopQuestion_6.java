package AdditionalQuestions;

import java.util.Scanner;

public class ForLoopQuestion_6 {
    public static void main(String[] args) {

        // İstifadəçidən 20-dən kiçik rəqəm alın və bu ədədin faktorial qiymətini hesablayın.
        // Konsolda faktor hesabının konfiqurasiyasını da çap edin.
        // Və ya: 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa 20 den kici bir sayi daxil edin: ");
        int reqem = input.nextInt();
        int faktorial = 1;

        for (int i = reqem; i >= 1; i--) {
            System.out.print(i + " * ");
            faktorial *= i;
        }
        System.out.println("= " + faktorial);
    }
}
