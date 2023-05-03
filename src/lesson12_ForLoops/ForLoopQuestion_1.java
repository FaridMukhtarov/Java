package lesson12_ForLoops;

import java.util.Scanner;

public class ForLoopQuestion_1 {
    public static void main(String[] args) {

        // Istifadeciden iki sayi alin ve bu sayilar daxil olaraq
        // aralarindaki 3 ile bolune bilen sayilari yazdirin
        // ilk girilen sayi ikinci sayidan boyukse xetta mesajini yazdir

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zehmet olmazsa 2 reqem daxil edin: ");

        int birinciReqem = scanner.nextInt();
        int ikinciReqem = scanner.nextInt();

        if (birinciReqem > ikinciReqem){
            System.out.println("Ilk Reqem Kicik olmalidr");
        }else {
            for (int i = birinciReqem; i <= ikinciReqem ; i++) {
                if (i % 3 == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
