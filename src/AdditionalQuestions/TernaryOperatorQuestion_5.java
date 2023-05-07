package AdditionalQuestions;

import java.util.Scanner;

public class TernaryOperatorQuestion_5 {
    public static void main(String[] args) {

        // İstifadəçidən iki ədəd alın və böyük olmayan rəqəmi çap edin

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa iki ferqli eded daxil  edin : ");

        int birinci = input.nextInt();
        int ikinci = input.nextInt();

       int netice = birinci > ikinci ? ikinci : birinci;
        System.out.println(netice);
    }
}
