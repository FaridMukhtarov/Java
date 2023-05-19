package AdditionalQuestions;

import java.util.Scanner;

public class ForLoopQuestion_5 {
    public static void main(String[] args) {

        // İstifadəçidən 20-dən kiçik rəqəm alın və bu ədədin faktorial qiymətini hesablayın.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa 20 den kici bir sayi daxil edin: ");
        int reqem = input.nextInt();
        int faktorial = 1;

        for (int i = reqem; i >= 1; i--) {

            faktorial *= i;
        }
        System.out.println("Faktorial: " + faktorial);
    }
}
