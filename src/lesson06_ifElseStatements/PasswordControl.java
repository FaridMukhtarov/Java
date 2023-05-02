package lesson06_ifElseStatements;

import java.util.Scanner;

public class PasswordControl {
    public static void main(String[] args) {

        /*
        Istifadeciden bir reqem daxil etmesini isteyin
        Reqem asagidaki 4 serti tamamlayirsan "Mukemmel Reqerm" Yazdir

        1 Reqem 4 ededli olmalidir
        2 reqem 3 ile bolunememelidir
        3 reqem 5 ile bolunmemelidir
        4 reqemin birler basamagi tek reqem olmalidr
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir tam reqem daxil edin: ");
        int reqem = input.nextInt();

        boolean flag = true;

        if (reqem < 1000 || reqem > 9999){
            flag = false;
        }
        if (reqem % 3 != 0){
            flag = false;
        }
        if (reqem % 5 == 0){
            flag = false;
        }

        if ((reqem % 10) % 2 == 0){
            flag = false;
        }
        if (flag){
            System.out.println("Mukemmel Reqerm");
        }


    }
}
