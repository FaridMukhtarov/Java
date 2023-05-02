package lesson07_NestedIfElseStatements;

import java.util.Scanner;

public class Nested_IfElseStatements_2 {
    public static void main(String[] args) {

        // istifadeciden cinsini ve yasini al
        // Qadinin yasi 60 yas ve ust, kisinin 65 yas ve ustu pensiyaya cixa biler
        // cinsiyet ye yasi diqqete alaraq "pensiyaya cixa bilersen"
        // pensiyaya cixmaqin ucun hele islemelisen

        Scanner input = new Scanner(System.in);

        System.out.print("Zehmet olmasa yasinizi daxil edin: ");
        int yas = input.nextInt();

        System.out.print("Zehmet olmasa cinsinizi qeyd edin: K/Q ");
        char cinsiyet = input.next().charAt(0);


        if (yas<15){
            System.out.println("kecersiz Yas daxil etdiniz");
        }
        else if (yas<60) {
            System.out.println("Pensiyaya cixa bilmesen");
            if (cinsiyet=='Q' || cinsiyet=='q'){
                System.out.println("Pensiyaya cixmaqiniz ucun " +(60-yas) + " il islemelisiniz");
            } else if (cinsiyet=='K' || cinsiyet=='k') {
                System.out.println("Pensiyaya cixmaqiniz ucun " +(65-yas) +  " il islemelisiniz");
            } else {
                System.out.println("xetali yasi deyeri!");
            }

        } else if (yas<65) {
            //Qadin ise pensiya cixa biler Kisi ise islemesi lazimdir
            if (cinsiyet=='Q' || cinsiyet=='q'){
                System.out.println("pensiyaya cixa Bilersiz");

            } else if (cinsiyet=='K' || cinsiyet=='k') {
                System.out.println("Pensiyaya cixmaqiniz ucun " +(65-yas) +  " il islemelisiniz");

            } else {
                System.out.println("xetali yasi deyeri!");
            }
        }else { // 65 den boyukse pensiya cixa bilerseen
            System.out.println("Pensiyaya cixa bilersen!");
        }
    }
}
