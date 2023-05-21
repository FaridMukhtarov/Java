package AdditionalQuestions;

import java.util.Scanner;

public class MethodCreationQuestion_4 {
    public static void main(String[] args) {

        // main metodda istifadəçidən tam ədəd alın.
        // Daxil edilmiş ədədin müsbət tam  bolunen ədədlərinin sayını
        // tapan və onu bizə qaytaran Method yaradın.

        Scanner input = new Scanner(System.in);
        System.out.print("Tam eded daxil edin: ");
        int tamEded = input.nextInt();

        int count = bolunenEdedSayi(tamEded);
        System.out.println("Müsbət tam bölünən ədədlərin sayı: " + count);
    }
    public static int bolunenEdedSayi (int eded){

        int count = 0;
        for (int i = 1; i <= eded; i++) {
            if (eded % i == 0 && i > 0){
                count++;
            }
        }
        return count;
    }
}
