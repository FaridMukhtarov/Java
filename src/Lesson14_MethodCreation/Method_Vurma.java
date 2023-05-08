package Lesson14_MethodCreation;

import java.util.Scanner;

public class Method_Vurma {
    public static void main(String[] args) {

        // main method icinde istifadeciden iki reqem al
        // bu iki reqemi al parametir olaraq qebul edib vurmalarini main method-da donderen method yarad

        Scanner vurma = new Scanner(System.in);
        System.out.println("Zehmet olmasa iki reqem daxil edin:");

        double reqem1 = vurma.nextDouble();
        double reqem2 = vurma.nextDouble();
        System.out.println(vurmaMethod(reqem1,reqem2));

//        double vurmaNetice = vurmaMethod(5.6,6.6);
//        System.out.println(vurmaNetice);

    }
    public static double vurmaMethod(double reqem1, double reqem2){

        return reqem1*reqem2;
    }
}
