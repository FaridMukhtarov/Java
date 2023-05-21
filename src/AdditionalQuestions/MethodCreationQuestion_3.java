package AdditionalQuestions;

import java.util.Scanner;

public class MethodCreationQuestion_3 {
    public static void main(String[] args) {

        // main metodda istifadəçidən müsbət tam ədəd alın.
        // Daxil edilmiş ədədin asal ədəd olub-olmadığını yoxlayib və nəticədə
        // "Asal" və ya "Asal deyil"i qaytaran Method yaradın.

        Scanner input = new Scanner(System.in);
        System.out.print("Pozitiv bir eded daxil edin: ");
        int eded = input.nextInt();

        asalSayiYoxlama(eded);
    }
    public static void asalSayiYoxlama (int eded){

        boolean asalMI = true;

        for (int i = 2; i < eded; i++) {

            if (eded % i  == 0){
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
