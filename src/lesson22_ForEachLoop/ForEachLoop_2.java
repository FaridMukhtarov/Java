package lesson22_ForEachLoop;

public class ForEachLoop_2 {
    public static void main(String[] args) {

        // Soru 2- Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[]  arr = {5,6,4,3,5,9,6,3,3,2};
        int toplama = 0;

        for ( int each : arr) {
            toplama += each * each;
        }
        System.out.println("Arra-in karelerini cemi: "  + toplama);
    }
}
