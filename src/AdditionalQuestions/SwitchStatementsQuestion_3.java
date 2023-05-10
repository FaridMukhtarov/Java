package AdditionalQuestions;

import java.util.Scanner;

public class SwitchStatementsQuestion_3 {
    public static void main(String[] args) {


        // İstifadəçidən ay nömrəsini alın və ayın adını çap edin

        Scanner input = new Scanner(System.in);
        System.out.print("Zehemet olmasa ayin reqemini daxil edin: ");
        int eded = input.nextInt();

        String ay;
        switch (eded){
            case 1:
                ay = "Yanvar";
                break;
            case 2:
                ay = "Fevral";
                break;
            case 3:
                ay = "Mart";
                break;
            case 4:
                ay = "Aprel";
                break;
            case 5:
                ay = "May";
                break;
            case 6:
                ay = "Iyun";
                break;
            case 7:
                ay = "Iyul";
                break;
            case 8:
                ay = "Avqust";
                break;
            case 9:
                ay = "Sentiyabr";
                break;
            case 10:
                ay = "Oktyabr";
                break;
            case 11:
                ay = "Noyabr";
                break;
            case 12:
                ay = "Decabr";
                break;
            default:
                ay = "Zehmet olmasa 1 ile 12 arasinda bir eded saxil edin";
        }
        System.out.println("Daxil edilmiş nömrəye gor netice: " + ay);
    }
}
