package lesson03_DataCastingAndWrapperClass;

import java.util.Scanner;

public class CharDataCasting {
    public static void main(String[] args) {

        System.out.println('a' + 'b'); // 97 + 98 = 195


        // istifadeciden bir karakter alin ve o karakterden gelen uc karakteri yazdir
        Scanner input = new Scanner(System.in);
        System.out.print("zehemet olmasa bir karakter daxil edin: ");

        char  c = input.next().charAt(0);
        System.out.println(""+(char)(c+1) +(char)(c+2) +(char)(c+3) );
    }
}
