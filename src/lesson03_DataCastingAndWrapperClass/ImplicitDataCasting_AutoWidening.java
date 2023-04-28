package lesson03_DataCastingAndWrapperClass;

public class ImplicitDataCasting_AutoWidening {
    public static void main(String[] args) {

        // Data Casting (Data type-larin deyisdirilmesidir)

        /*
        1 Data Casting: Java-da uygun data novleri arasinda kecis mumkundur
        hem Primitiv data novleri arasinda hemde Non Primitiv data novleri
        ucun data casting mumkundur
        2 Her data novleri bir birine cast edile bilmez. misal boolean Stringe-e veya char boolean-a.
        Ancaq reqem deyeri olan byte, short, int, long, float, double, kimi oxsar data novleri birbirine  cast ola bilir
        3 eger daha dar tutumlu bir data novundeki deyer, genis tutumlu data novundeki variable-a atilirsa java bunu avtomatik
        olaraq eder (Auto Widening)
        4 Eger tersi olarsa genis tutmdan dara data novune cevirilirse explicit narrowing deyilir
        */

        // Auto Widening kicik data tipindeki bir deyeri boyuk bir deyere atanda,
        // Java avtomatik kicik data tipini boyuk data tipine cevirir ve buna Auto Widening deyilir


        // Widening Casting of a Class Type
        byte byteReqem = 100;
        short shortReqem = byteReqem;
        int intReqem = shortReqem;;
        long longReqem = intReqem;
        float floatReqem = longReqem;
        double doReqem = floatReqem;

        System.out.println(doReqem);
    }
}
