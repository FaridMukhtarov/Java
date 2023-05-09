package lesson17_Scope;

public class ClassLevelVariables {

    // Static Variables
    static String xestexanaName = "Ulduz Xestexana";
    static int xesteSayi = 2586;
    static String basHekimAdi;


    // Instance Variables
    String personalAdi = "Yoxdur";
    String personalTel;
    int personalYas;

    public static void main(String[] args) {
        System.out.println(xestexanaName); // Ulduz Xestexana
        System.out.println(basHekimAdi); // null
    }

    public static void method1(){
        System.out.println(basHekimAdi);
        xesteSayi++;
    }

    public void method2(){
        // Static variabl-lar static olmayan ve static olan method-da istifade edile biler
        System.out.println(xestexanaName);
        System.out.println(xesteSayi);

        // static olmayan variable-lar ancaq static olmayan method-larda istifade edile biler
        System.out.println(personalAdi);
        System.out.println(personalTel);
        System.out.println(personalYas);
    }
}
