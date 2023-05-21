package AdditionalQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysQuestion_5 {
    public static void main(String[] args) {

        // Arra-in ölçüsünü və elementlərini istifadəçidən alan və
        // arra-i yaradıb bizə qaytaran metod yaradın.

        int[] yeniArray = istifadeciArrayYaradmaq();
        System.out.println(Arrays.toString(yeniArray));
    }
    public static int[] istifadeciArrayYaradmaq (){
        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa yaradmag istedyiniz array-in elemet sayini daxil edin: ");
        int length = input.nextInt();

        int[] istifadeciArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Array-e daxil edilecek bir sayi daxil edin: ");
            istifadeciArray[i] = input.nextInt();
        }
        return istifadeciArray;
    }
}
