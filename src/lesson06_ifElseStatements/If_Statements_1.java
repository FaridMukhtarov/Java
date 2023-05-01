package lesson06_ifElseStatements;

import java.util.Scanner;

public class If_Statements_1 {
    public static void main(String[] args) {

        // If Statements

        // isdifadeciden iki sayi al
        // eger birinci sayi 100-den doyukdurse "Ilk sayi 100-den boyukdur" yazdir
        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa iki ferqli reqem daxil edin: ");

        int say1 = input.nextInt();
        int say2 = input.nextInt();

        if (say1 > 100) {
            System.out.println("Ilk sayi 100-den boyukdur");
        }

        // eger ikinci sayi cutdurse "ikinci sayi cudur"
        if (say2 %  2 == 0){
            System.out.println("ikinci sayi cudur");
        }

        // eger ilk sayi ikinci sayidan boyukdurse "Ilk sayi ikinci sayidan boyukdur"
        if (say1 > say2){
            System.out.println("Ilk sayi ikinci sayidan boyukdur");
        }
    }
}
