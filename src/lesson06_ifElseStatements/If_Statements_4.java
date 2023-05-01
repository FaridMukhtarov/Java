package lesson06_ifElseStatements;

import java.util.Scanner;

public class If_Statements_4 {
    public static void main(String[] args) {

        // İstifadəçidən sayi istəyin, sayini yoxlayın və 5-ə bölünurse
        // "5-ə qat". Yazdir

        Scanner input = new Scanner(System.in);
        System.out.println("Zehemet olmasa sayi daxil edin: " );
        int  sayi = input.nextInt();

        if (sayi%5==0){
            System.out.println("5-ə qat");
        }
    }
}
