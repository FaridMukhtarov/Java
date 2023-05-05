package AdditionalQuestions;

import java.util.Scanner;

public class IfStatementsQuestion_1 {
    public static void main(String[] args) {

        // İstifadəçidən sayi istəyin, sayini yoxlayın və
        // 5-ə bölünürsə, "Sayi 5-ə qat" deyilse
        // "Sayi 5’in tam qati deyil" yazısını çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir sayi daxil edin: ");
        int sayi = input.nextInt();

        if (sayi % 5 == 0){
            System.out.println("Sayi 5’in tam qati");
        }
        if (sayi % 5 != 0){
            System.out.println("Sayi 5’in tam qati deyil");
        }
    }
}
