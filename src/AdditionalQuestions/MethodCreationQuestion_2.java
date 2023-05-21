package AdditionalQuestions;

import java.util.Scanner;

public class MethodCreationQuestion_2 {
    public static void main(String[] args) {

        // main metodda istifadəçinin adını və soyadını ayrıca alın
        // Ad və soyadın ilk hərflərini böyük, digər hərfləri isə kiçik hərflərlə
        // duzeldin və ad boşluq soyad kimi bizə qaytaran method yaradın.
        // giriş : ad : ferid soyadı : Mukhtarov. çıxış : Farid Mukhtarov


        Scanner input = new Scanner(System.in);
        System.out.print("Adinizi saxil edin: ");
        String ad = input.next();
        System.out.print("Soyadinizi daxil edin: ");
        String soyad = input.next();

        String ready = adSoyadDuzeltme(ad,soyad);
        System.out.println(ready);
    }
    public static String adSoyadDuzeltme (String ad, String soyad){

        String netice = ad.substring(0,1).toUpperCase() + ad.substring(1).toLowerCase()
                + " " + soyad.substring(0,1).toUpperCase() + soyad.substring(1).toLowerCase();
        return netice;
    }
}
