package AdditionalQuestions;

import java.util.Scanner;

public class NestedIfStatements_3 {
    public static void main(String[] args) {

        // İstifadəçidən sayi alın, əgər sayi təkdirsə, mənfi və ya müsbət
        // tək ədəddirsə yazdirin, sayi cüt ədəddirsə, 10-un tam qati olub olmadigini onu çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir sayi daxil edin: ");

        int say = input.nextInt();

        if (say % 3 == 0){
            if (say >= 0){
                System.out.println("Daxil etdiyiniz reqem pozitiv ededir");
            }else
                System.out.println("Daxil etdiyiniz reqem menfi ededir");
        } else if (say % 2 == 0) {
            System.out.println("Daxil etdiyiniz eded cutdur");
            if (say % 10 == 0){
                System.out.println("10-un tam qatidir");
            }
        }else
            System.out.println("daxil etdiyiniz reqem 10-unu tam qati deyil");
    }
}
