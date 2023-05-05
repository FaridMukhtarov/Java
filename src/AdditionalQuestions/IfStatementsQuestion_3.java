package AdditionalQuestions;

import java.util.Scanner;

public class IfStatementsQuestion_3 {
    public static void main(String[] args) {

        // İstifadəçidən bir eded alın, ədəd 3-ə bölünürsə
        // “3-ə bölünən ədəd”, 5-ə bölünürsə “5-ə bölünən ədəd” çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir eded daxil edin: ");
        int eded = input.nextInt();

        if (eded % 3 == 0){
            System.out.println("3-ə bölünən ədəd");
        }
        if (eded % 5 == 0) {
            System.out.println("5-ə bölünən ədəd");
        }
    }
}
