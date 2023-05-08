package Lesson14_MethodCreation;

public class MethodQuestion_3 {
    public static void main(String[] args) {

        // istifadeciden main methodun icinde pozitiv bir sayi alib
        // daxil edilen sayinin asal olub olmadigi
        // bunu yoxluyacaq bir method yaradi

        int number = 24;
        System.out.println(asalSayiTap(number)); // Asal deyil
        System.out.println(asalSayiTap(45)); // Asal deyil
        System.out.println(asalSayiTap(41)); // Asal
    }
    public static String asalSayiTap (int number){
        String netice ="";

        for (int i = 2; i <= (number-1); i++) {
            if (number%i==0){
                netice = "Asal deyil";
                break;
            }
        }
        if (!netice.equals("Asal deyil")){
            netice = "Asal";
        }
        return netice;

    }
}
