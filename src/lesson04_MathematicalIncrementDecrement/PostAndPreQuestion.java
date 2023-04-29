package lesson04_MathematicalIncrementDecrement;

import java.util.Scanner;

public class PostAndPreQuestion {
    public static void main(String[] args) {
        // istifadeciden bir tam reqem isteyib
        // daxil edilen tam reqemi yazdirib
        // sonra bir artirin

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir tam sayi daxil edin: ");

        int daxilEdilenReqem = input.nextInt();

        System.out.println("Daxil etdiyiniz tam reqem: " + daxilEdilenReqem
                + "\nDaxil edilen reqem bir artilmisi: " + ++daxilEdilenReqem);
    }
}
