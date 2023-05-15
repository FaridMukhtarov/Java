package lesson29_Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Encapsulation {
    public static void main(String[] args) {

         /*
       Javada encapsulation bir clas daxilinde data-larin (fields) ve funksiyalarin (Metodlarin)
       diger class-lar terefinden elcatanligini idare etmek ucun istifade edilen proqramlsdirma prinsibidr.

       encapsulation class daxilinde data-larin private olaraq teyin etmekle ve bu data-lara daxil olmaq ucun
       public getter ve setter metodlardan istifade etmekle heyata kecirilir
       Beləliklə, class-dan kənar digər class-lar yalnız public metodlardan istifadə edərək class daxilindəki məlumatlara daxil ola bilər.

       Bu prinsip class-lar arasında təhlükəsizliyi artırmağa və kodu idarə etməyi asanlaşdırmağa kömək edir.
       encapsulation həmçinin class-in daxili strukturunu dəyişmədən data-larin saxlanma üsullarını dəyişmək üçün çeviklik təmin edir.
       Buna görə də Java proqramlaşdırma dilində encapsulation obyekt yönümlü proqramlaşdırmanın əsas prinsiplərindən biridir.


       Böyük layihələrdə datayi görmək (read) və ya datayi dəyişdirmək (write).
       səlahiyyətlərini bir-birindən asılı olmayaraq tənzimləmək istenile biler

       Access modifier ile class uzuvlerine basqa class'lardan giris mehdudlasdirla biler

       ANCAQ
       Əlçatan datalar üçün həm oxumaq, həm də yazmaq mümkün olsa da,
       əlçatmaz datalar nə oxuna bilər, nə də dəyişdirilə bilər

       Real həyat ehtiyaclarını nəzərə alaraq,
       icazə məhdudiyyətini Java-ya uyğunlaşdırmaq istəyiriksə

       - Oxumaq və yazmaq səlahiyyətini birlikdə verib-verməməkdən söhbət gedirsə
         Access modifier istifadə olunur

       - Əgər oxumaq və yazma icazələri bir-birindən ayrılacaqsa
         onda Access modifier kifayət etməyəcək
         Encapsulation (getter və setter method-lari) istifadə edilməlidir.
         */

        // get ve set əvvəlki java obyektlərində qarsimiza cixmisdi

        List<Integer> reqemler = new ArrayList<>();
        reqemler.add(3);
        reqemler.add(6);
        reqemler.add(8);

//        System.out.println(reqemler.get(1));
//        System.out.println(reqemler.set(8,4));
    }
}
