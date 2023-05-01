package lesson06_ifElseStatements;

import java.util.Scanner;

public class IfElse_Statements_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir karakter daxil edin: ");

        char ch = input.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Boyuk herif");
        }else {
            System.out.println("Boyuk herif deyil");
        }
    }
}
