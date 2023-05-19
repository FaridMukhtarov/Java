package AdditionalQuestions;

import java.util.Scanner;

public class ForLoopQuestion_4 {
    public static void main(String[] args) {

        // Başlanğıc və son dəyər kimi istifadəçidən müsbət ədədlər alın, sərhədlər daxil olmaqla,
        // onların arasındakı bütün ədədlərin cəmini çap edin.
        // Son dəyər başlanğıc dəyərdən kiçik olsa belə, proqramı işə salın


        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa baslangic deyeri daxil edin: ");
        int baslangic = input.nextInt();
        System.out.print("Zehmet olmasa bitis deyeri daxil edin: ");
        int bitis = input.nextInt();
        int cem =0;

        if (bitis < baslangic){
            for (int i = bitis; i <= baslangic ; i++) {
                cem += i;
            }
            System.out.println("Bitis deyeri Baslangic deyerinden kick: " + cem);

        }else {
            for (int i = baslangic; i <= bitis ; i++) {
                cem += i;
            }
            System.out.println("Daxil edilen reqemlerin aralararindaki sayilarin cemi: " + cem);
        }
    }
}
