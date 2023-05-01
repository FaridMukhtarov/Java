package lesson06_ifElseStatements;

import java.util.Scanner;

public class IfElse_Statements_3 {
    public static void main(String[] args) {

        // ne vaxt pensiyaya cixiriq

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa yasinizi daxil edin: ");

        int yas = input.nextInt();

        if (yas >= 65){
            System.out.println("Siz pensiyaya cixa bilersiz");
        }else {
            System.out.println("Sizin pensiyaya cixmaqiniz ucun " + (65-yas) + " il islemelisiniz");
        }


    }
}
