package AdditionalQuestions;

import java.util.Scanner;

public class StringManipulationsQuestion_11 {
    public static void main(String[] args) {

        // İstifadəçidən String götürün, əgər Sətin uzunluğu cüt ədəddirsə, ortasına :) əlavə edin,
        // Sətin uzunluğu təkdirsə, orta hərfi silin və :( ilə əvəz edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir soz daxil edin: ");
        String soz = input.next();

        if (soz.length() % 2 == 0){
            soz = soz.substring(0, soz.length()/2) +
                    ":)" + soz.substring(soz.length()/2);
        }else {
            soz = soz.substring(0,soz.length() / 2)
                    + ":(" + soz.substring(1+ soz.length() /2);
        }
        System.out.println(soz);
    }
}
