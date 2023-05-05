package AdditionalQuestions;

import java.util.Scanner;

public class IfStatementsQuestion_2 {
    public static void main(String[] args) {

        // İstifadəçidən bir herif alin, hərflə başlayan bir ay varsa çap edin.
        // QEYD: Böyük və ya kiçik hərf həssaslığı olmasin.
        // İstifadəçi o və ya O yazdıqda, çıxış Yanvar olsun.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet Olmasa Bir Herif Daxil edin: ");
        String herif = input.next().substring(0,1);

        if (herif.equalsIgnoreCase("Y")){
            System.out.println("Yanvar");
        }
        if (herif.equalsIgnoreCase("F")){
            System.out.println("Fevral");
        }
        if (herif.equalsIgnoreCase("M")){
            System.out.println("Mart & May");
        }
        if (herif.equalsIgnoreCase("A")){
            System.out.println("Aprel & Avqust");
        }
        if (herif.equalsIgnoreCase("i")){
            System.out.println("Iyun & Iyul");
        }
        if (herif.equalsIgnoreCase("s")){
            System.out.println("Sentiyabr");
        }
        if (herif.equalsIgnoreCase("o")){
            System.out.println("Oktiyabr");
        }
        if (herif.equalsIgnoreCase("N")){
            System.out.println("Noyabr");
        }
        if (herif.equalsIgnoreCase("D")){
            System.out.println("Decabr");
        }
    }
}
