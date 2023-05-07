package AdditionalQuestions;

import lesson02_DataTypeAndScanner.ScannerObject;

import java.util.Scanner;

public class NestedIfStatements_1 {
    public static void main(String[] args) {

        // İstifadəçidən cinsi və yaşı alın, Qadın, 60 yaş və yuxarı,
        // Kişi 65 yaş və yuxarı təqaüdə çıxa bilər. Cins və yaş
        // nəzərə alınmaqla “Təqaüdə çıxa bilərsiniz” və ya “Təqaüdə
        // çıxmaq üçün daha çox işləmək lazımdır..” çap edin.

        Scanner input = new Scanner(System.in);

        System.out.print("Zehmet olmasa cinsinizi qeyyd edin: K / Q ");
        String cins = input.next().substring(0,1);

        System.out.print("Zehmet olmasa yasinizi qeyd edin: ");
        int yas = input.nextInt();


        if (cins.equalsIgnoreCase("q")){
            if (yas > 0 && yas < 15){
                System.out.println("Dovlet qanuna gore siz ilslemenizi qanuna ziddir!");
            } else if (yas >= 15 && yas <= 60) {
                System.out.println("Teqaude cixmaq ucun " + (60-yas) + " il islemelisiz");
            }else
                System.out.println("Siz teqaude cixa bilersiz");


        } else if (cins.equalsIgnoreCase("k")) {
            if (yas > 0 && yas < 15){
                System.out.println("Dovlet qanuna gore siz ilslemenizi qanuna ziddir!");
            } else if (yas >= 15 && yas <= 65) {
                System.out.println("Teqaude cixmaq ucun " + (65-yas) + " il islemelisiz");
            }else
                System.out.println("Siz teqaude cixa bilersiz");

        }else
            System.out.println("Yanlis Melumat girisi!");
    }
}
