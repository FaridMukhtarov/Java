package AdditionalQuestions;

import java.util.Scanner;

public class SwitchStatementsQuestion_4 {
    public static void main(String[] args) {

        // İstifadəçinin ISTQB abbreviaturasından herifin mənasını öyrənmək istədiyini alın və müvafiq hərfi çap edin.
        // I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner input = new Scanner(System.in);
        System.out.print("ISTQB abbreviaturasından herifin mənasını öyrənmək Herif daxil edin: ");
        String herif = input.next().substring(0,1).toUpperCase();

        String aciqlama;
        switch (herif){
            case "I":
                aciqlama = "International";
                break;
            case "S":
                aciqlama = "Software";
                break;
            case "T":
                aciqlama = "Testing";
                break;
            case "Q":
                aciqlama = "Qualifications";
                break;
            case "B":
                aciqlama = "Board";
                break;
            default:
                aciqlama = "Yanlis herif daxil etdiniz";
        }
        System.out.println("Daxil edilmiş Herife gor netice: " + aciqlama);


    }
}
