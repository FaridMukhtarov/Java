package AdditionalQuestions;

import java.util.Scanner;

public class SwitchStatementsQuestion_2 {
    public static void main(String[] args) {

        // İstifadəçidən 2 rəqəmli nömrə alın və daxil edilmiş nömrəni mətndə çap edin

        Scanner input = new Scanner(System.in);
        System.out.print("Zehemet olmasa bir eded daxil edin: ");
        int eded = input.nextInt();

        if (eded < -99 || (eded >- 10 && eded < 10) || eded > 100 ) {
            System.out.println("Iki reqemli eded daxil etmediniz");
        }else
            if (eded<0){
                System.out.println("Menfi");
                eded *= -1;
            }
        switch (eded / 10){
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Iyirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Qirx");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmis");
                    break;
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doxsan");
                    break;
        }

        switch (eded % 10){
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alt");
                break;
            case 7:
                System.out.println("yeddi");
                break;
            case 8:
                System.out.println("sekkiz");
                break;
            case 9:
                System.out.println("doqquz");
                break;
            default:
                System.out.println("Daxil etdiyiniz eded sistemde qeyd olunmayib");

        }
    }
}
