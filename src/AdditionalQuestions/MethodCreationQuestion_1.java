package AdditionalQuestions;

import java.util.Scanner;

public class MethodCreationQuestion_1 {
    public static void main(String[] args) {

        //  istifadeciden input olarak verilen bir String, baslangic ve bitis indexlerine gore baslangic index'i daxil,
        //  bitis index'i xaric olacaq sekilde aradaki harfleri yazdiran bir method olusturun.

        // - istifadeci baslangic deyeri olaraq, bitis deyerinden buyuk bir eded daxil ederse, xeta mesaji verin
        // - istifadeci str'da olan index'lerden daha buyuk bir index daxil ederse xeta mesaji yazdirin.

        String input = "Java ne qeder gozeldir";
        int baslangicIndx = 5;
        int bitmeIndex = 7;

        ozSubstingMethod(input,baslangicIndx,bitmeIndex);
        ozSubstingMethod("Java",1,3);
        ozSubstingMethod("yoxlama",6,3);
        ozSubstingMethod("java",6,8);
    }
    public static void ozSubstingMethod (String input, int baslangicIndx, int bitmeIndx){
        if (baslangicIndx>bitmeIndx){
            System.out.println("Baslangic index Bitme Index-den boyuk ola bilmez:");
        } else if (bitmeIndx>=input.length()) {
            System.out.println("Bitme index-i String-in serhedleri xaricinde");
        }else {
            for (int i = baslangicIndx; i < bitmeIndx; i++) {
                System.out.print(input.charAt(i));
            }
        }    System.out.println();
    }
}
