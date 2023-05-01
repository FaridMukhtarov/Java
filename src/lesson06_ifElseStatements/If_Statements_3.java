package lesson06_ifElseStatements;

import java.util.Scanner;

public class If_Statements_3 {
    public static void main(String[] args) {

        // istifadeciden ucbucaqin 3 kenarini al
        // kenarlarin birbirini beraberdir yazdir

        Scanner input = new Scanner(System.in);
        System.out.println("Zehmet olmasa 3 bucaqin 3 kenarini daxil edin");

        int kenar1 = input.nextInt();
        int kenar2 = input.nextInt();
        int kenar3 = input.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1 > 0) {
            System.out.println("bərabərtərəfli üçbucaq");

        }
    }
}
