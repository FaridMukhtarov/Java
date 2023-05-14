package lesson24_StaticKeywordAndPassByValue;

public class TibbBacisi {
    static String xestexanaAdi = "Ulduz Xestexanasi";
    static String xestexanaAdresi = "Yasamal / Baki";
    static String bashekimAdi = "Dr Farid Mukhtarov";

    String personalAdi = "Ad qeyyd edilmedi";
    String personalAdresi = "Adres qeyyd edilmedi";
    String personalTelfon = "telfon qeyyd edilmedi";

    @Override
    public String toString() {
        return "          TibbBacisi" +
                "\npersonalAdi: "  + personalAdi +
                "\npersonalAdresi: " + personalAdresi +
                "\npersonalTelfon: " + personalTelfon +
                "\nxestexanaAdi: " + xestexanaAdi +
                "\nxestexanaAdresi: " + xestexanaAdresi +
                "\nbashekimAdi: " + bashekimAdi;

    }
}
