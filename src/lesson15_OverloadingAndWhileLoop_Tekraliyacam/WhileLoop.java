package lesson15_OverloadingAndWhileLoop_Tekraliyacam;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        // istifadəçidən nömrə alin və istifadeci 3-ə bölünən ədədi daxil edənə
        // qədər onun 3-ə bölünüb-bölünmədiyini çap edin yenidən dəyər istəyin

        Scanner scanner = new Scanner(System.in);

        int sayi=30;

        while(sayi %3 != 0){
            System.out.println("Lutfen pozitif bir tamsayi girin");
            sayi= scanner.nextInt();

            if (sayi%3==0){
                System.out.println("sayi 3 ile tam bolunuyor");
            }else{
                System.out.println("sayi 3 ile tam bolunemiyor");
            }
        }

    }
}
