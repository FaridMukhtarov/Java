package lesson03_DataCastingAndWrapperClass;

import java.util.Scanner;

public class QuestionDataCasting_2 {
    public static void main(String[] args) {

        // istifadeciden iki double reqem ali
        // birinci reqemi ikinci reqeme bol
        // ve prosesin neticesini tam reqem (int) olaraq ekrana yazdir

        Scanner input = new Scanner(System.in);
        System.out.println("Zehmet olmasa iki ondaliqli sayi daxil edin!");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        int bolme = (int) (num1/num2);

        System.out.println(bolme);
    }
}
