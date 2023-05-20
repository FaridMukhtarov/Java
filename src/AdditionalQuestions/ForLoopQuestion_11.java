package AdditionalQuestions;

import java.util.Scanner;

public class ForLoopQuestion_11 {
    public static void main(String[] args) {

        // İstifadəçidən müsbət tam ədəd istəyin,
        // nömrənin asal olub olmadığını yoxlayın və nəticəni çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir eded daxil edin: ");
        int asal = input.nextInt();
        boolean asalMI = true;

        for (int i = 2; i < asal; i++) {

            if (asal % i  == 0){
                asalMI = false;
                break;
            }
        }
        if (asalMI){
            System.out.println("Asal reqem");
        }else
            System.out.println("Asal Reqem deyil");
    }

}