package lesson15_OverloadingAndWhileLoop_Tekraliyacam;

public class Method_Overloading {
    public static void main(String[] args) {

        String str = "Java oyrndik, novbeti gelsin";
        System.out.println(str.substring(2,4));

        // Bir class-da eyni adda amm ferqli signature-a sahib method-lar yaradilmasina
        // method Overloading deyilir

        vurma(3,5); // Method call sirasinda methood mortezesine yazilanlara Arqumet deyileir (Yani 3,5 bir Arqumetdir)
        vurma(3.4,2);

    }
    // bir classda eyni ad ve eyni signature-a sahib method olmaz
    /*
    Method Overloading olan class-larda Java hansi methodun isleyeceyine
    bele bele qerar verir
    Method call ederken
    1- once Method adina baxar
    2- arqument sayisi ile parametre sayisina baxar
    3- arqument ve parametr uygunluguna baxar
    4- Minumum Casting olana
     */
    public static void vurma (int sayi1, int sayi2){ // vurma int int
        System.out.println("Iki integerin vurmasi method: " + sayi1*sayi2);
    }

    public static void vurma (int sayi3, int sayi4, int sayi5){ // vurma int int int
        System.out.println("Uc intger vurmasi methodu: " + sayi3*sayi4*sayi5);
    }

    public static void vurma (double sayi3, int sayi4) { // vurma double integer
        System.out.println("double integer vurmasi methodu: " + sayi3*sayi4);
    }
    public static void vurma (int sayi3, double sayi4) { // vurma integer  double
        System.out.println("integer double vurmasi methodu: " + sayi3*sayi4);

    }
}
