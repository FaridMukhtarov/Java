package lesson08_TernaryOperatorAndSwitchCase;

import java.util.Scanner;

public class Ternary_1 {
    public static void main(String[] args) {

        // istifadeciden bir sayi al
        // eger sayi pozitivse  2 qatini yazdirin
        // eger pozitiv deyilse 10 elave edib yazdirn

        Scanner input = new Scanner(System.in);
        System.out.print("zehmet olmasa bir reqem daxil edin: ");
        double sayi = input.nextDouble();

        // if Else Statements
        if (sayi>0){
            System.out.println(sayi*2);
        }else {
            System.out.println(sayi+10);
        }

        // Ternary Operators
        System.out.println(sayi>0 ? 2*sayi : sayi+10);
    }
}
