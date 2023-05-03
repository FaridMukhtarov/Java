package lesson12_ForLoops;

public class ForLoopQuestion_2 {
    public static void main(String[] args) {

        // verilen iki sayi ve aralarindaki butun tam sayilari cemleyib yazdirin
        // iki sayidan hansinin kicik oldugu bilinmir

        int reqem1 = 100;
        int reqem2 = 200;
        int cem = 0;

        if (reqem1 < reqem2){
            for (int i = reqem1; i <= reqem2; i++) {
                cem+=i;
            }
        }else {
            for (int i = reqem2; i <= reqem1; i++) {
                cem+=i;
            }
        }
        System.out.println(cem);
    }
}
