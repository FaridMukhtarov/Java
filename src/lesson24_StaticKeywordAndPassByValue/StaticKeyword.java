package lesson24_StaticKeywordAndPassByValue;

public class StaticKeyword {
    public static void main(String[] args) {

        // Static Keyword

        // Bir Classin icerisindeki Variables ve Method- larla Class-dan Object yaradmadan
        // Class adi uzerinden daxil olmağımıza imkan veren Acar Sozdur (Static Keyword)

        // Static bir method icerisinde  static olmayan hec
        // bir seye çata bilmirik (Mudaxile ve ya istifade kimi)


        // Java dilində static Keyword Class-in özünə aid olan Class Variable-larini və
        // metodlarını təyin etmək üçün istifadə olunur.
        // O, Class-in konkret obyektine deyil, Class-a aiddir.
    }

    // Burada, static Keyword-un Java-da variable ilə necə istifadə edildiyini göstərən bir nümunədir:
    public static int myStaticVar = 0;

    // Burada, static Keyword-un Java-da bir metodla necə istifadə edildiyini göstərən bir nümunədir:
    public static void myStaticMethod() {
        // method code goes here
    }

    // Java'da, static Variable-lar və method-lar, bir Class-in xüsusi nümunəsi deyil,
    // Class-in adını istifadə edərəy elcatan olur.
    // Məsələn, yuxarıda göstərilən (myStaticVar) Variable-ini bu şəkildə istifadə edə bilərsiniz:

    int x = StaticKeyword.myStaticVar;

}
