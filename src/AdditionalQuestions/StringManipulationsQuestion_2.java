package AdditionalQuestions;

import java.util.Scanner;

public class StringManipulationsQuestion_2 {
    public static void main(String[] args) {

        // İstifadəçidən cumle alin və cumlede axtarilmasi ucun bir soz  alın.
        // sətirdə axtarılan mətnin olub-olmadığını çap edin.

        Scanner input = new Scanner(System.in);

        System.out.print("Zehmet olmasa bir Cumle daxil edin: ");
        String cumle = input.nextLine();

        System.out.print("Zehmet olmasa axtarilacaq sozu daxil edin: ");
        String soz = input.next();

        int index = cumle.indexOf(soz);
        if (!(index == -1)){
            System.out.println("Axtardiginiz soz cumlede movcudur: " + soz);
        }else
            System.out.println("Axtardiginiz soz cumlede movcud deyil: " + soz);


    }
}
