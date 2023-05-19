package lesson35_Exceptions;

public class  Exceptions {
    public static void main(String[] args) {

        /*
        Exception, Java-da proqramın normal gedişatını pozan hadisədir

        Java-da proqramın icrası zamanı gözlənilməz vəziyyətlə qarşılaşması istisnadır (exception).
        Bu hallar proqramın düzgün işləməsinə mane ola bilər və proqramın səhv nəticələr
        verməsinə səbəb ola bilər. Java, istisnaların (exceptions) idarə edilməsini təmin etmək üçün
        istisnaların (exceptions) idarə edilməsi mexanizmini təmin edir. Bu mexanizm sayəsində proqramçılar
        gözlənilməz vəziyyətləri izləyə və lazımi cavab verə bilərlər.


        Java-da istisnalar (exceptions) "try-catch" blokunda tutula bilər. "try" bloku potensial səhvə meyilli kod
        parçasını ehtiva edir. Səhv baş verərsə, "catch" bloku işə salınır və xəta tutulduqdan sonra lazımi
        tədbirlər görülür. Həmçinin, istisna (exception) baş verdikdə, istisna (exception) Class-inin nümunəsi yaradılır
        və "catch" blokunda bu misaldan istifadə etməklə səhv haqqında daha çox məlumat əldə etmək olar.


        Java həmçinin "finally" blokunu təmin edir. İstisna (exception) baş versə belə, bu blokun məzmunu həmişə icra olunur.
        Adətən, "finally" bloku resursların azad edilməsi kimi zəruri təmizləmə işləri aparır.


        Java-da istisnalar (exceptions) da "Throw" açar sözü ilə əl ilə Yaradila biliner və "throw" açar sözü ilə funksiyalar
        tərəfindən atılır. Bu, funksiyaya potensial olaraq baş verən istisnaları bildirməyə imkan verir və bu funksiyanın
        çağırıldığı yerdə istisnaları (exceptions) idarə etmək üçün addımlar atmağa imkan verir.


        // FileNotFoundException
        // IOException
        // RunTimeException
        // Exception
        // ArithmeticException
        // InputMisMatchException

         */

        int a = 5;
        int b = 0;

        try {
            System.out.println(a / b);
        }catch ( ArithmeticException e) { // Handling exception
            e.printStackTrace(); // Show error code
        }
        System.out.println("Code Working");

    }
}
