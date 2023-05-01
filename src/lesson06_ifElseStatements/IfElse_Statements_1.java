package lesson06_ifElseStatements;

import java.util.Scanner;

public class IfElse_Statements_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Zehmet olmasa 3 bucaqin 3 kenarini daxil edin");

        int kenar1 = input.nextInt();
        int kenar2 = input.nextInt();
        int kenar3 = input.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0) {
            System.out.println("bərabərtərəfli üçbucaq");
        }else {
            System.out.println("bərabərtərəfli üçbucaq deyil");
        }
    }
}
