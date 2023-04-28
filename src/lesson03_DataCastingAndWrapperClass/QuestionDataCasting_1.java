package lesson03_DataCastingAndWrapperClass;

import java.util.Scanner;

public class QuestionDataCasting_1 {
    public static void main(String[] args) {

        // istifadeciden bir sayi alin
        // istifadeci nece daxil ederse etsin
        // ekrana -128 ile 127 araliqinda bir sayi yazdir

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir tam sayi daxil edin: ");

        int reqem = input.nextInt();
        byte newByte = (byte) reqem;

        System.out.println("Daxil etdiyiniz sayi " + reqem + " (byte) novu: " + newByte);
    }
}
