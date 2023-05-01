package lesson06_ifElseStatements;

import java.util.Scanner;

public class If_ElseIf_Statements_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Zehmet olmasa 3 bucaqin 3 kenarini daxil edin");

        int kenar1 = input.nextInt();
        int kenar2 = input.nextInt();
        int kenar3 = input.nextInt();

        if(kenar1<=0 || kenar2<=0 || kenar3<=0){
            System.out.println("Kecersiz kenar uzunlugu");
        } else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("BeraberKenar Ucbucaq");
        }else {
            System.out.println("Beraber ucbucaq deyil");
        }
    }
}
