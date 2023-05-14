package lesson24_StaticKeywordAndPassByValue;

public class TibbBcisiRunner {
    public static void main(String[] args) {

        TibbBacisi h1 = new TibbBacisi();
        h1.personalAdi = "Gulnar";
        h1.personalAdresi = "Masazir";
        h1.personalTelfon = "6876970";
        System.out.println(h1);

        TibbBacisi h2 = new TibbBacisi();
        h2.personalAdi = "Arzu";
        h2.personalAdresi = "Agdas";
        h2.personalTelfon = "745879";
        h2.bashekimAdi = "Ferid";

        System.out.println("h1 : " + h1);
        System.out.println("h2 : " + h2);

        TibbBacisi h3=new TibbBacisi();
        System.out.println("h3 : "+h3);
        h3.xestexanaAdresi = "Java Xestexanasi";

        System.out.println(h2.xestexanaAdresi); // Java Xestexanasi

    }
}
