package lesson06_ifElseStatements;

import java.util.Scanner;

public class If_ElseIf_Statements_4 {
    public static void main(String[] args) {

        // istifadeciden bir tam sayi alin
        // sayi neqativse kecersiz sayi
        // tek ededli is "Tek ededli reqem"
        // iki ededli ise " iki ededli reqem"
        // bunu xaricinde olan olanlar ucun "Boyuk sayi " yazsin

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmetolmasa bir sayi daxil edin: ");

        int num = input.nextInt();

        if (num<0){
            System.out.println("Kecersiz sayi daxil etdiniz");
        } else if (num>0 && num<=9) {
            System.out.println("Tek ededli reqem");
        } else if (num>=10 && num<=99) {
            System.out.println("Iki edeli reqem");
        }else {
            System.out.println("Boyuk sayi");
        }
    }
}
