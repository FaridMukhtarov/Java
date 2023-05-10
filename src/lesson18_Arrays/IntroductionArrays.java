package lesson18_Arrays;

import java.util.Arrays;

public class IntroductionArrays {
    public static void main(String[] args) {

        String[] herfler = new String[100];
        int[] arr1 = {2,4,6,8,10};

        System.out.println(arr1[2]); // 6
        arr1[3] = 20;
        System.out.println(arr1[3]); // 20

        System.out.println(arr1.length); // 5

        // son elementi yazdir
        System.out.print(arr1[arr1.length-1]); // 10

        // array-in butun elemtlerini yazdir
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }

        // array-in uzunlugu sonradan deyisdirilmez
        // eger arrayda olmayan bir index-e deyer elave etmek istesek
        // bu xeta Compile time error CTE deyil,  Run Time error-dur

        // arr1[5] = 55; // ArrayIndexOutOfBoundsException

        String [] arr = {"Ferid","Ali", "Fuad" };

        // Bu array-in butun elementlerini arasinda bir bosluq buraxaraq yazdir
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " "); // Ferid Ali Fuad
        }

        // Bu array-i array olarq yazdir
        // array bir object / non-primitive data novu oldugundan java referansini yazdirir
        System.out.println(arr); // [Ljava.lang.String;@378bf509


        System.out.println(Arrays.toString(arr)); // [Ferid, Ali, Fuad]
        // array-i array olaraq yazdirmaq istesek arrays class-indan komek almaliyiq
    }
}
