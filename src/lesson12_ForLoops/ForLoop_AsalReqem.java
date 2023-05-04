package lesson12_ForLoops;

public class ForLoop_AsalReqem {
    public static void main(String[] args) {

        // verilen bir reqemin asal sayil olub olmadigini yazdir

        int sayi = 91;
        boolean asalmi = true;

        for (int i = 2; i < sayi; i++) {
            System.out.println("Yoxla " + i);
            if (sayi % i == 0) {
                asalmi = false;
                break;
            }
        }
        if (asalmi){
            System.out.println("Sayi asal");
        }else
            System.out.println("Asal deyil");
    }
}
