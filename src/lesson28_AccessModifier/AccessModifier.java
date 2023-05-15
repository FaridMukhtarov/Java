package lesson28_AccessModifier;

public class AccessModifier {
    public static void main(String[] args) {

        /*
        Java-da Access Modifier Class-larin, metodların və Variable-larin giriş
        səviyyəsini təyin etmək üçün istifadə olunan açar sözlərdir (Keyword). Access Modifier-lar
        avtorizasiya və təhlükəsizliyi təmin etmək üçün proqramlaşdırma dillərində istifadə olunur.
        Java-da üç Access Modifier var:  public, protected ve private..

           Public: İstənilən yerdən əlçatandır.
           Protected: Eyni paket daxilində və ya child Class-lar tərəfindən əldə edilə bilər.
           Private: Yalnız eyni Class daxilində əlçatandır.
           Default: Bu class daxilinde ve Bu package ucun elacatandir  (package-private)

        Varsayılan olaraq, Java-da Access Modifier yoxdursa (yəni göstərilməyibse), class və ya variable
        "package-private" (paket-şəxsi) hesab olunur. Bu o deməkdir ki, ona yalnız eyni paket daxilindəki class-lar daxil ola bilər.

        Access Modifier-lar Class-larin, Method-larin və Variable-lerin təhlükəsizliyinə və avtorizasiyasına
        nəzarət etmək üçün istifadə olunur. Məsələn, Private Access Modifie-i ilə müəyyən edilmiş variable
        yalnız həmin class-in daxilində əlçatan olacaq ki, bu da digər class-lasrin həmin variable-in təsadüfən
        dəyişməsinin və ya istifadəsinin qarşısını ala bilər.
         */
        System.out.println(number); // 25
        number = 30;
        System.out.println(number); // 30

        System.out.println(name); // Farid
        System.out.println(aLong); // 3423423

    }
    public static int number = 25;
    public static String name = "Farid";
    private static long aLong = 3423423;

    protected static void now () {
        name = "Fuad";
        System.out.println(name);
    }
}
