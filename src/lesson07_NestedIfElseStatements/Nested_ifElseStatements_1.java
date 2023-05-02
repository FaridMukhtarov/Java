package lesson07_NestedIfElseStatements;

import java.util.Scanner;

public class Nested_ifElseStatements_1 {
    public static void main(String[] args) {

        // istifadeciden cinsini ve yasini al
        // Qadinin yasi 60 yas ve ust, kisinin 65 yas ve ustu pensiyaya cixa biler
        // cinsiyet ye yasi diqqete alaraq "pensiyaya cixa bilersen"
        // pensiyaya cixmaqin ucun hele islemelisen

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa cinsinizi qeyd edin: ");
        String cins = input.nextLine();

        System.out.print("Zehmet olmasa yasinizi daxil edin: ");
        int yas = input.nextInt();

        if (cins.equals("Q")){
            if (yas>60){
                System.out.println("Siz Pensiyaya Cixa Bilersiniz!");
            } else if (yas>15 && yas<=60) {
                System.out.println("Siz hele " + (60-yas) + " il islemelisiz");
            }else {
                System.out.println("Dovlet Qanunna gore size islemek olmaz!");
            }

        } else if (cins.equals("K")) {
            if (yas>65){
                System.out.println("Siz Pensiyaya Cixa Bilersiniz!");
            } else if (yas>15 && yas<=65) {
                System.out.println("Siz hele " + (65-yas) + " il islemelisiz");
            }else {
                System.out.println("Dovlet Qanunna gore size islemek olmaz!");
            }
        }else {
            System.out.println("Yanlis cinsiyet girisi!");
        }
    }
}
