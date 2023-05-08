package Lesson14_MethodCreation;

public class MethodQuestion_1 {
    public static void main(String[] args) {

        // Sual: Istifadeciden input olaraq alinan bir String al
        // baslangic ve bitme index-lerine gore baslangic index-i daxil, bitme index-i xarixc olacaq sekilde
        // ordaki herifleri yazdiran bir method yarad
        // isdifadeci baslangic deyeri olaraq , bitme deyerinden boyuk bir sayi daxil ederse xeta mesaji versin
        // istifadeci str-da oalan index-lerden boyuk bir index daxil ederse xeta mesaji versin

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
        }    System.out.println("");
    }
}
