package lesson15_OverloadingAndWhileLoop;

public class WhileLoop_4 {
    public static void main(String[] args) {

        int sayi = 5;
        int us = 3;
        usHesablaMethod(sayi,us);

    }

    public static void usHesablaMethod(int sayi, int us){
        int netice = 1;
        while (us>0){
            netice*=sayi;
            us--;
        }
        System.out.println(netice);
    }
}
