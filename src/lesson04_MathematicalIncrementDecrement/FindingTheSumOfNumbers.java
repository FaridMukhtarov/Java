package lesson04_MathematicalIncrementDecrement;

import java.util.Scanner;

public class FindingTheSumOfNumbers {
    public static void main(String[] args) {

        // istifadeciden 3 basamakli pozitif bir tamsayi alib
        // sayinin raqamlar toplamini yazdirin
        // meselem 213 daxil edildiynde 6 yazdirsin

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa 3 basamakli pozitif bir tamsayi daxil edin: ");

        int reqem = input.nextInt();
        int birlerBasamagi = 0;
        int reqemlerToplamai = 0;


        birlerBasamagi = reqem % 10;
        reqemlerToplamai = reqemlerToplamai + birlerBasamagi;
        reqem = reqem / 10;  // 213 / 10 ==> 21

        // sayi 213 birlerBasamagi = 3  raqamlar cemi = 3

        birlerBasamagi = reqem % 10;  // 21 %10 ==> 1
        reqemlerToplamai = reqemlerToplamai + birlerBasamagi; // 3 + 1 = 4
        reqem = reqem / 10; // 21 / 10 ==> 2

        birlerBasamagi = reqem % 10; // 2 % 10 = 2
        reqemlerToplamai = reqemlerToplamai + birlerBasamagi; // 4 + 2 = 6

        System.out.println("Daxil edilen reqemlerin cemi: " + reqemlerToplamai);






    }
}
