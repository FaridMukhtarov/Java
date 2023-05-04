package lesson12_ForLoops;

public class ForLoopReqemlerinCemi {
    public static void main(String[] args) {

        int sayi = 1453;
        int basamaqSayi = (""+sayi).length();
        int reqem = 0;
        int reqemlerCemi = 0;

        for (int i = 1; i <= basamaqSayi ; i++) {
            reqem = sayi % 10;
            reqemlerCemi += reqem;
            sayi /= 10;
        }
        System.out.println("Reqemler Cemi: " +reqemlerCemi);

    }
}
