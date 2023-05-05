package AdditionalQuestions;

import java.util.Scanner;

public class IfElseStatementsQuestion_3 {
    public static void main(String[] args) {

        // İstifadəçidən yaşını soruşun, 65 və ya daha yuxarı yaşdadırsa,
        // “Siz pensiyaya çıxa bilərsiniz” yazısını çap edin, əks halda
        // təqaüdə çıxmaq üçün işləməli olduğu illərin sayını çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa yasinizi daxil edin: ");
        int yas = input.nextInt();

        if (yas >= 65){
            System.out.println("Siz Təqaüdə çıxa bilərsiniz!");
        }else
            System.out.println("Təqaüdə çıxmaq üçün " + (65-yas) + " il Islemelisiz!");
    }
}
