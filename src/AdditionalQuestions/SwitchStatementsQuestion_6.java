package AdditionalQuestions;

import java.util.Scanner;

public class SwitchStatementsQuestion_6 {
    public static void main(String[] args) {

        // İstifadəçidən ay nömrəsini alın və mövsümü çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Ayn reqemini daxil ederek hansi fesil oldugunu oyrenmek ucun bir eded daxil edin: ");
        int ayNo = input.nextInt();


        switch (ayNo) {

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
