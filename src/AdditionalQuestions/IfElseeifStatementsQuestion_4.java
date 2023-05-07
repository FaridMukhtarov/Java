package AdditionalQuestions;

import java.util.Scanner;

public class IfElseeifStatementsQuestion_4 {
    public static void main(String[] args) {

        // İstifadəçidən məsafəni kilometrlərlə alın
        // və çevirmək istədiyi vahidi soruşun, əgər
        // istədiyi vahid metr və ya santimetrdirsə,
        // çevirib çap edin, əks halda “istədiyiniz
        // vahid sistemdə qeydiyyatda deyil” yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa mesafeni kilometr (km) olaraq daxil edin: ");
        int mesafe = input.nextInt();
        double cevirlen = 0;


        System.out.print("Cevirmek istediyiniiz vahidi qeyd edin: ");
        String vahid = input.next();

        if (vahid.equalsIgnoreCase("metir")){
            cevirlen = mesafe * 1000;
            System.out.println("Daxil etdiyiniz kilometir " + mesafe + " km"
                             + " sistemin metir olaraq cevirdiyi: " + cevirlen);
        } else if (vahid.equalsIgnoreCase("santimetr")) {
            cevirlen = mesafe * 100000;
            System.out.println("Daxil etdiyiniz kilometir " + mesafe + " km"
                    + " sistemin santimetir olaraq cevirdiyi: " + cevirlen);
        }else
            System.out.println("istədiyiniz vahid sistemdə qeydiyyatda deyil");
    }
}
