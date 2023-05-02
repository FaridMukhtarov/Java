package lesson08_TernaryOperatorAndSwitchCase;

import java.awt.event.MouseAdapter;

public class SwitchCase_3 {
    public static void main(String[] args) {

        int ayNo = 5;
        switch (ayNo){

            case 12:
            case 1:
            case 2:
                System.out.println("Qis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Yaz");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yay");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Payiz");
                break;
            default:
                System.out.println("Kecersiz Ay");
        }
    }
}
