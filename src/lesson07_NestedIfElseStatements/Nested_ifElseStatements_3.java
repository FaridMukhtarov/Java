package lesson07_NestedIfElseStatements;

import java.util.Scanner;

public class Nested_ifElseStatements_3 {
    public static void main(String[] args) {


        // istifadeciden aldigi mesulun sayini ve list qiymetini al
        // istifadecinin musteri karti olub olmadigini sorus
        // musteri karti varsa 10 mesuldan artiq alibsa %20 yoxsa %15 endirim edin
        // musteri karti yoxdursa 10 mesuldan  artiq alibsa %15 yoxsa %10 endirim edin

        Scanner input = new Scanner(System.in);
        System.out.print("Aldiginiz mesul sayini yazin: ");
        int mesulEdedi = input.nextInt();

        System.out.print("Mesul liste qiymetini daxil edin: ");
        double listQiymet = input.nextDouble();

        System.out.print("Musteri kartiniz varmi? B : Beli, X : Xeyir : ");
        char kartvarmi = input.next().toUpperCase().charAt(0);

        double cemQiymet = 0;


        if (kartvarmi == 'B'){ // karti olanlar

            if (mesulEdedi > 10){
                cemQiymet = mesulEdedi * listQiymet * 80/100;
                System.out.print("%20 endirimli cem qiymeti: " + cemQiymet);
            }else {
                cemQiymet = mesulEdedi * listQiymet * 85/100;
                System.out.print("%15 endirimli cem qiymeti: " + cemQiymet);
            }


        } else if (kartvarmi == 'X') { // karti olmuyanlar

            if (mesulEdedi > 10){
                cemQiymet = mesulEdedi * listQiymet * 85/100;
                System.out.print("%15 endirimli cem qiymeti: " + cemQiymet);
            }else {
                cemQiymet = mesulEdedi * listQiymet * 90/100;
                System.out.print("%10 endirimli cem qiymeti: " + cemQiymet);
            }

        }else { // Yanlis kart girisi
            System.out.println("Kart melumatlari yanlisdir");
        }
    }
}
