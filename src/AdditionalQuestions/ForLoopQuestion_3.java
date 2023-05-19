package AdditionalQuestions;

import java.util.Scanner;

public class ForLoopQuestion_3 {
    public static void main(String[] args) {

        // Istifadeciden baslangic ve bitis deyeri olaraq pozitif bir deyer al
        // serhedler daxil olaraq aralarindaki butun ededleri cemini yazdir.
        // bitis deyeri baslangic deyerinden kicikse. xeberdarliq yazdirib prossesi sonlandir

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa baslangic deyeri daxil edin: ");
        int baslangic = input.nextInt();
        System.out.print("Zehmet olmasa bitis deyeri daxil edin: ");
        int bitis = input.nextInt();
        int cem =0;

        if (bitis < baslangic){
            System.out.print("Bitis deyeri Baslangic deyerinden boyukdur");
        }else {
            for (int i = baslangic; i <= bitis ; i++) {
                cem += i;
            }
            System.out.println("Daxil edilen reqemlerin aralararindaki sayilarin cemi: " + cem);
        }
    }
}
