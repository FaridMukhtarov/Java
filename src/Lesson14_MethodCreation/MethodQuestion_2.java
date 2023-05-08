package Lesson14_MethodCreation;

public class MethodQuestion_2 {
    public static void main(String[] args) {

        // istifadeciden ad ve familayasini ayri ayri al
        // ad ve familya ilk herifler Boyuk, diger herifler kicik olacaq sekilde duzeldib
        // ad bosluq familya sekilinde bize donderen bir metho yarad
        // Numune; ad FERID, familaya MUXTAROV, output: Farid Muxtarov

        String ad = "FaRId";
        String familya = "mUXTaROV";

        System.out.println(basHerif(ad,familya)); // Farid Muxtarov
        System.out.println(basHerif("sAmIR", "NIyazoV")); // Samir Niyazov
    }
    public static String basHerif (String ad, String familya){

        String yeniAdFamilya = ad.substring(0, 1).toUpperCase()
                + ad.substring(1).toLowerCase()
                +" "
                + familya.substring(0, 1).toUpperCase()
                + familya.substring(1).toLowerCase();

        return yeniAdFamilya;

    }
}
