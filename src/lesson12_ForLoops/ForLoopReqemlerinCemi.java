package lesson12_ForLoops;

public class ForLoopReqemlerinCemi {
    public static void main(String[] args) {

        // isdifadecinin verdiyi reqemler toplamini tap

//        int sayi = 1453;
//        int basamaqSayi = (""+sayi).length();
//        int reqem = 0;
//        int reqemlerCemi = 0;
//
//        for (int i = 1; i <= basamaqSayi ; i++) {
//            reqem = sayi % 10;
//            reqemlerCemi += reqem;
//            sayi /= 10;
//        }
//        System.out.println("Reqemler Cemi: " +reqemlerCemi);


        int reqem = 1453;
        String reqemStr = String.valueOf(reqem);
        int birler = 0;
        int reqemlerToplami = 0;

        for (int i = 1; i <= reqemStr.length() ; i++) {

            birler = reqem % 10;
            reqemlerToplami = reqemlerToplami + birler;
            reqem = reqem / 10;
        }
        System.out.println(reqemlerToplami);

    }
}
