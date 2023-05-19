package AdditionalQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulationsQuestion_8 {
    public static void main(String[] args) {

        // İstifadəçi tərəfindən müəyyən formatda verilən String qiymətləri toplayın və çap edin.
        // giriş1: “15,30 €” , giriş2: “11,40 €”
        // çıxış: 26.70 €


        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa toplamag istediyiniz meblegi valuytasi ile birlikde daxil edin (Misal: 15.55 Dollar): ");
        String birinciMebleg = input.nextLine();
        System.out.print("Ikicinci meblegi daxil edin (Misal: 13.05 Dollar): ");
        String ikinciMebleg = input.nextLine();

        stringReqemleriToplama(birinciMebleg , ikinciMebleg);
    }
    public static void   stringReqemleriToplama (String birinciMebleg, String ikinciMebleg){

        String[] birinci = birinciMebleg.split(" ");
        String[] ikinci = ikinciMebleg.split(" ");
        double netice = Double.parseDouble(birinci[0]) + Double.parseDouble(ikinci[0]);
        System.out.println("Daxil etdiyiniz melumatlarin neticesi: " + netice);
    }
}
