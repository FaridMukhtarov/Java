package lesson06_ifElseStatements;

import java.util.Scanner;

public class If_ElseIf_Statements_3 {
    public static void main(String[] args) {

        // istifadeciden cinsini ve yasini al
        // Qadinin yasi 60 yas ve ust, kisinin 65 yas ve ustu pensiyaya cixa biler
        // cinsiyet ye yasi diqqete alaraq "pensiyaya cixa bilersen"
        // pensiyaya cixmaqin ucun hele islemelisen

        Scanner pensiya = new Scanner(System.in);
        System.out.print("Zehemet olmasa Cinsinizi yazin :");
        String cins = pensiya.nextLine();
        System.out.print("Zehmet olmasa yasinizi daxil edin :");
        int yas = pensiya.nextInt();

        if (cins.equalsIgnoreCase("Qadin") && yas>=60) {
            System.out.println("Pensiyaya cixa bilersen");
        } else if (cins.equalsIgnoreCase("Qadin") && yas<60 && yas>18) {
            System.out.println("Pensiyaya cixmaqin ucun hele " + (60-yas) +" il islemelisen");
        }else if (cins.equalsIgnoreCase("Kisi") && yas>=65) {
            System.out.println("Pensiyaya cixa bilersen");
        }else if (cins.equalsIgnoreCase("Kisi") && yas<65 && yas>18){
            System.out.println("Pensiyaya cixmaqin ucun hele " + (65-yas) +" il islemelisen");
        }else{
            System.out.println("Gecersiz giris");
        }
    }
}
