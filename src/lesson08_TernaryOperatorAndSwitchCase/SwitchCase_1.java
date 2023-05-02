package lesson08_TernaryOperatorAndSwitchCase;

import java.util.Scanner;

public class SwitchCase_1 {
    public static void main(String[] args) {

        // Switch Case Mortezelerin icinde (Long, Double, Float, Boolean)
        // istifade edilmez

        // Isdifadecinin  daxil etdiyi gun reqemini
        // gun adini ekrana yaz

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet Olmasa 1 den 7 ye kimi bir reqem daxil ednin: ");

        int gunNo = input.nextInt();

        //int gunNo = 0;
        /*
        if (gunNo==1){
            System.out.println("Monday");
        } else if (gunNo==2) {
            System.out.println("Tuesday");
        }else if (gunNo==3) {
            System.out.println("Wednesday");
        }else if (gunNo==4) {
            System.out.println("Thursday");
        }else if (gunNo==5) {
            System.out.println("Friday");
        }else if (gunNo==6) {
            System.out.println("Saturday");
        }else if (gunNo==7) {
            System.out.println("Sunday");
        }else {
            System.out.println("Wrong Day");
        }
         */

        switch (gunNo){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Day");
                break;
        }
    }
}
