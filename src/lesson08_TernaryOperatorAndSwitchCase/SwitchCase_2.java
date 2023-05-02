package lesson08_TernaryOperatorAndSwitchCase;

import java.util.Scanner;

public class SwitchCase_2 {
    public static void main(String[] args) {

        // J: Java
        // D: Development
        // K: Kit

        // isdifadeciden bir herif al
        // herife gore yuxadakilardan birini yazdir

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir herif daxil edin: ");
        char herif = input.next().charAt(0);

        switch (herif){
            case 'J':
                System.out.println("Java");
                break;
            case 'D':
                System.out.println("Development");
                break;
            case 'K':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Kecersiz Herif");
        }
    }
}
