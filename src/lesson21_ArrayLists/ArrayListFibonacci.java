package lesson21_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListFibonacci {
    public static void main(String[] args) {

        // istifadeciden bir pozitif tam reqem alin
        // o tamreqemde kick Fibonacci reqemlerini bir list
        // olaraq yazdirin

        // Fibonacci 0 1 1 2 3 5 8 13 21 34 55 89 144 ... bir reqem ozunden gelen sayini toplamasidir

        Scanner input = new Scanner(System.in);
        System.out.println("Zehmet olmasa Pozitif bir tam reqem daxil edin: ");
        int daxilEdilenReqem = input.nextInt();

        if(daxilEdilenReqem<0){
            System.out.println("Fibonacci ucun 0-den boyuk tam sayi daxil etmelisiz");
        }else if (daxilEdilenReqem == 0){
            System.out.println("0-dan kicik Fibonacci sayisi yoxdur");
        }else if (daxilEdilenReqem==1){
            System.out.println("1-dan kicik tek Fibonacci sayisi vardir: 0");
        }else {
            fibonacciReqemleriniYazdir(daxilEdilenReqem);
        }
    }
    public static void fibonacciReqemleriniYazdir(int daxilEdilenReqem) {
        // buraya geldikse daxil edilen sayi 1-den boyukdur

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);
        fibonacciList.add(1);

        int yenifobSayiReqem = 0;
        int index = 3; // ilk 3 element 0 1 1 oldugu ucun 3.index-e geldik

        while (yenifobSayiReqem<daxilEdilenReqem){
            yenifobSayiReqem = fibonacciList.get(index-2) + fibonacciList.get(index-1);

            if (yenifobSayiReqem<daxilEdilenReqem){
                fibonacciList.add(yenifobSayiReqem);
            }
            index++;
        }
        System.out.println(fibonacciList);
    }
}
