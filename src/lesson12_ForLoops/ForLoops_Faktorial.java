package lesson12_ForLoops;

public class ForLoops_Faktorial {
    public static void main(String[] args) {

        // isdifadecinin verdiyi sayini tap faktorial
        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120

        int reqem = 10;
        int faktorial = 1;

        for (int i = reqem; i >= 1 ; i--) {
            faktorial *= i;
        }

        System.out.println(faktorial);

        // 1-den 100-e qeder olan sayilari topla
        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam = toplam + i;
        }
        System.out.println(toplam);
    }
}
