package lesson12_ForLoops;

public class ForLoop_AsalReqem {
    public static void main(String[] args) {

        // istifadecinin verdiyi  bir reqemin asal olub olmadigini tap
        // asal sayi: 1 ve ozunden basqa tamreqeme tam bolunmeyen reqemdir


        int sayi = 91;
        boolean asalmi = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalmi = false;
                break;
            }
        }
        if (asalmi){
            System.out.println("Asal reqem");
        }else
            System.out.println("Asal Reqem deyil");
    }
}
