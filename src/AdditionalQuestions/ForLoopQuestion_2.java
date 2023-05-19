package AdditionalQuestions;

import java.util.Scanner;

public class ForLoopQuestion_2 {
    public static void main(String[] args) {

        // İstifadəçidən müsbət tam ədəd al, 1-dən daxil edilen edede qeder
        // (daxil edilmiş sayi daxil olmaqla) 7-yə bölünən ədədləri yazdir çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir sayi daxil edin: ");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
