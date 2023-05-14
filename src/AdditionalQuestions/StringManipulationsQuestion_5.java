package AdditionalQuestions;

import java.util.Scanner;

public class StringManipulationsQuestion_5 {
    public static void main(String[] args) {

        // İstifadəçidən bir cümlə alın
        // - cümlədə ev varsa, "home home sweet home" yazın
        // - cümlədə iş varsa, "işləmək xoşdur"
        // - ikiside varsa "Ev, həm də iş lazımdır"
        // - heç bir şey yoxdursa, "çox işləməlisən" yaz

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir cumle daxil edin: ");
        String cumle = input.nextLine().toLowerCase();

        if (cumle.contains("ev") && cumle.contains("is")){
            System.out.println("Ev, həm də iş lazımdır");
        } else if (cumle.contains("is")) {
            System.out.println("işləmək xoşdur");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        }else
            System.out.println("çox işləməlisən");
    }
}
