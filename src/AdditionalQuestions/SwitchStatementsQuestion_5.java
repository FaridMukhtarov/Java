package AdditionalQuestions;

import java.util.Scanner;

public class SwitchStatementsQuestion_5 {
    public static void main(String[] args) {

        // İstifadəçidən gün nömrəsini alın və onu həftə içi və ya həftə sonu oldugunu çap edin

        Scanner input = new  Scanner(System.in);
        System.out.print("Zehmet olmasa 1 ile 7 arasinda bir eded daxil edin: ");
        int eded = input.nextInt();

        String gun;
        switch (eded){
            case 1:
                gun = "həftə içi";
                break;
            case 2:
                gun = "həftə içi";
                break;
            case 3:
                gun = "həftə içi";
                break;
            case 4:
                gun = "həftə içi";
                break;
            case 5:
                gun = "həftə içi";
                break;
            case 6:
                gun = "həftə sonu";
                break;
            case 7:
                gun = "həftə sonu";
                break;
            default:
                gun = "Daxil edtiyiniz reqeme gor hec bir netice tapilmadi";
        }
        System.out.println(gun);



    }
}
