package AdditionalQuestions;

import java.util.Scanner;

public class IfStatementsQuestion_4 {
    public static void main(String[] args) {

        // İstifadəçidən üçbucağın 3 tərəfli uzunluğunu alın,
        // əgər üçbucaq bərabərtərəflidirsə, “Bərabər üçbucaq” yazın.

        int kenar1, kenar2, kenar3;
        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa ucbucaqin 3 tərəfli uzunluğunu daxil edin: ");

        kenar1 = input.nextInt();
        kenar2 = input.nextInt();
        kenar3 = input.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0){
            System.out.println("Bərabər üçbucaq");
        }
        if (!(kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0)) {
            System.out.println("Bərabər üçbucaq deyil");
        }
    }
}
