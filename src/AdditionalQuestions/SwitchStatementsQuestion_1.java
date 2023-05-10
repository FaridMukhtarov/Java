package AdditionalQuestions;

import java.util.Scanner;

public class SwitchStatementsQuestion_1 {
    public static void main(String[] args) {

        // İstifadəçidən eded alın və ededi yazılı şəkildə çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehemet olmasa bir eded daxil edin: ");
        int eded = input.nextInt();

        switch (eded){
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("iki");
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
                System.out.println("Alt");
                break;
            case 7:
                System.out.println("Yeddi");
                break;
            case 8:
                System.out.println("Sekkiz");
                break;
            case 9:
                System.out.println("Doqquz");
                break;
            case 10:
                System.out.println("On");
                break;
            default:
                System.out.println("Daxil etdiyiniz eded sistemde qeyd olunmayib");
        }
    }
}
