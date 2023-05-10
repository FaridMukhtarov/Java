package lesson18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IstifadeciyeArrayYaradmaq {
    public static void main(String[] args) {

        // istifadeciden array’in boyutunu ve elementlerini alip array’i yaradan ve bize
        // donduren bir method yaradin.

        int[] istifadeci =  ArrayYaratmaq();
        System.out.println(Arrays.toString(istifadeci));

    }
    public static int[] ArrayYaratmaq (){
        Scanner input = new Scanner(System.in);

        System.out.println("Zehmet olmasa Array-in boyunu daxil edin");
        int lenght = input.nextInt();

        int [] istifadeciArray = new  int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.print("Array-e daxil edilecek bir sayi daxil edin:");
            istifadeciArray[i] = input.nextInt();
        }
        return istifadeciArray;

    }
}
