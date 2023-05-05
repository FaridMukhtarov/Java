package AdditionalQuestions;

import java.util.Scanner;

public class IfElseStatementsQuestion_1 {
    public static void main(String[] args) {

        // İstifadəçidən üçbucağın 3 tərəfli uzunluğunu alın, əgər üçbucaq
        // bərabərtərəflidirsə “Bərabər üçbucaq”, əks halda “Bərabərtərəfli deyil” yazın.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa üçbucağın 3 tərəfli uzunluğunu daxil edin: ");

        int kenar1, kenar2, kenar3;
        kenar1 = input.nextInt();
        kenar2 = input.nextInt();
        kenar3 = input.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0){
            System.out.println("Bərabər üçbucaq");
        }else {
            System.out.println("Bərabərtərəfli deyil");
        }
    }
}
