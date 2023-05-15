package lesson30_inheritance;

public class inheritance extends NeqliyyatVasitesi{
    public static void main(String[] args) {

        /* Inheritance (extends),

        Java proqramlama dilinde inheritance ya da miras alma, bir class-in basqa bir class-dan
        ozeliklerini ve davranislarini miras alamasi demekdir

        Bir class, digər bir class-ın xüsusiyyətlərini və funksiyalarını extends yolu ilə istifadə edə bilər.
        Bu yol ilə, kodun yenidən istifadəsi və baxımı asanlaşır. Misal üzərində, "lesson43_toString.Person" class-ının xüsusiyyətləri
        və funksiyaları "Employee" class-ı tərəfindən extends yolu ilə istifadə edilə bilər. Bu yol ilə "Employee"
        class-ına aid xüsusiyyətlər və funksiyalar əlavə edilərkən "lesson43_toString.Person" class-ından extends yolu ilə istifadə edilmiş
        xüsusiyyətlər və funksiyalar da istifadə edilə bilər.

        Inheritance Bir Class (SubClass), basqa bir Class-in (BaseClass - SuperClass)
        xüsusiyyətlərini (Attribute) və funksiyalarıni (Method) istifadə edilmesine deyilir

        Ust Class - SubClass, SuperClass
        Alt Class - SubClass

        Alt Class (SubClass) tanitim eytibari ile Ust Class-dan
        (BaseClass-SuperClass) daha genis bir anlayış vardir

        Java Inheritance-da icaze verir Single level, Multi level, hierarchical, icaze verir
        amm multiple hierarchical, icaze vermir */

        // Inheritance sayesinde bir Child class yaratdigimizda
        // yeni hecbir variable ve ya method uaratmadan
        // parent clas(lar)'daki butun ozellikleri almis oluruq
        // Child class'da parent'dan gelen ozellikleri
        // update edebilir ve ya yeni ozellikler elave ede bolerik

        inheritance masin = new inheritance();
        System.out.println(masin.marka);
    }
}
