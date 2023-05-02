package lesson08_TernaryOperatorAndSwitchCase;

import java.util.Scanner;

public class SwitchCase_4 {
    public static void main(String[] args) {

        // Istifadeciden bir reqem alib reqemi yaziyla yazdir

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa 1-den 9-a qeder araliqda bir reqem secin:  ");
        int reqem = input.nextInt();

        switch (reqem){
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yeddi");
                break;
            case 8:
                System.out.println("Sekkiz");
                break;
            case 0:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Kecersiz Reqem");
        }
    }
}
