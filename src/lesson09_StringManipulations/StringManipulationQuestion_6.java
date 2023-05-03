package lesson09_StringManipulations;

public class StringManipulationQuestion_6 {
    public static void main(String[] args) {

        // Sual 4 : Istifadeciden bir sifre isteyib,
        // asagidaki serteri yoxlayib ve
        // istifadeciye duzeltmesi gereken butun eksikleri deyin,
        // eger butun sertler uygunsa, "sifre ugurla yadasa verildi" yazdir
        // - Ilk herih kicik herif olmali
        // - Son karakter reqem olmali
        // - Sifrede bosluk olmamalidir
        // uzunlugu en az 10 karakter

        String parol = "salamdunya1";
        int bayraq = 0;

        if (!(parol.charAt(0) >= 'a' && parol.charAt(0) <= 'z')) {
            System.out.println("Ilk herih kicik herif olmali");
            bayraq++;
        }
        if (!(parol.charAt(parol.length() - 1) >= '0' && parol.charAt(parol.length() - 1) <= '9')) {
            System.out.println("Son karakter reqem olmali");
            bayraq++;
        }
        if (parol.contains(" ")) {
            System.out.println("Sifrede bosluk olmamalidir");
            bayraq++;
        }
        if (!(parol.length() >= 10)) {
            System.out.println("Uzunlugu en az 10 karakter");
            bayraq++;
        }
        if (bayraq == 0) {
            System.out.println("Sifreniz Ugurla qeydiyata alindi");
        }
    }
}
