package Lesson14_MethodCreation;

import java.util.Scanner;

public class MethodCreation_2 {
    public static void main(String[] args) {

        // istifadeciden 2 reqem alin ve bu reqemlerin toplamasini hesabliyan method yarad

        // iki defe cagirsan iki defe yazdiracaq

        toplaYazdir();
        toplaYazdir();
    }
    public static void toplaYazdir (){

        Scanner input = new Scanner(System.in);
        System.out.println("Zehmet olmasa iki reqem daxil edin: ");

        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();

        double toplama = sayi1+sayi2;
        System.out.print("Daxil edilen reqemlerin toplami : " + toplama);
    }
}
