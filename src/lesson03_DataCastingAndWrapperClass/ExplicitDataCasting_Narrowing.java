package lesson03_DataCastingAndWrapperClass;

import java.util.Scanner;

public class ExplicitDataCasting_Narrowing {
    public static void main(String[] args) {

        // Narrowing Casting (larger to smaller type)
        int i = 20;
        short sh = (short) i;
        System.out.println(sh);

        double d = 34.4;
        int intNum = (int) d;
        System.out.println(intNum);

        i = 78;
        byte b = (byte) i;
        System.out.println(b);

        // Isdifadecinin daxil etdiyi int deyeri byte cevir konsula yazdir
        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa istelinen bir reqemi daxil edin: ");
        int usersNum = input.nextInt();

        byte byteNum = (byte) usersNum;

        System.out.println("Istifadecinin daxil etdiyi reqem (Byte): " +byteNum);
    }
}
