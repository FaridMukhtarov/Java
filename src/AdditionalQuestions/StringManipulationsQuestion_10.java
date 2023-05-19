package AdditionalQuestions;

import java.util.Scanner;

public class StringManipulationsQuestion_10 {
    public static void main(String[] args) {


        // İstifadəçinin adını və soyadını ayrıca alın.
        //- ad daha uzundursa, adı və soyadın ilk hərfi böyük, digərlərini kiçik, çap edin
        //- Əgər soyad daha uzundursa, adin ilk hərfi böyük, soyadı isə böyük hərflə yazın.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa Adinizi daxil edin: ");
        String ad = input.next();
        System.out.print("Zehmet olmasa Soyadinizi daxil edin: ");
        String soyad = input.next();

        adSoyadDuzeltme(ad, soyad);
    }
    public static void adSoyadDuzeltme (String ad, String soyad){

        if (ad.length() > soyad.length()){
            String netice = ad.substring(0,1).toUpperCase()
                    + ad.substring(1).toLowerCase()
                    + " " + soyad.substring(0,1).toUpperCase()
                    + soyad.substring(1).toLowerCase();
            System.out.println(netice);

        }else {
            String netice = ad.substring(0,1).toUpperCase()
                    + ad.substring(1).toLowerCase()
                    + " " + soyad.substring(0).toUpperCase();
            System.out.println(netice);
        }
    }
}
