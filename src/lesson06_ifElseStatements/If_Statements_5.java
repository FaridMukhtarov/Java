package lesson06_ifElseStatements;

import java.util.Scanner;

public class If_Statements_5 {
    public static void main(String[] args) {

        // Istifadeciden bir sayi alin, sayi 3 ile bolunurse ”Uc ile bolunebilen
        // sayi”, 5 ile bolunebilirse “Bes ile bolunebilen sayi” yazdirin

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmsa bir sayi daxil edin: " );
        int sayi = input.nextInt();

        if (sayi%3==0){
            System.out.println("Uc ile bolunebilen");
        }

        if (sayi%5==0){
            System.out.println("Bes ile bolunebilen sayi");
        }
    }
}
