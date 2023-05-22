package lesson42_Streams_TheEnd;

import java.util.ArrayList;
import java.util.List;

public class StreamsPractice {
    public static void main(String[] args) {

        // Java-da "Stream" məlumat toplusu üzərində əməliyyatların yerinə yetirilməsi üçün API-dir.

        // Stream, Data-larin mənbəyindən (məsələn, kolleksiya və ya array) ardıcıl və ya
        // paralel olaraq məlumatları emal etmək üçün istifadə olunur. Stream API data-larin
        // manipulyasiya əməliyyatlarını (filtrləmə, siralama, uyğunlaşdırma, çevirmə və s.)
        // sadə və oxunaqlı şəkildə ifadə etməyə imkan verir.

        // Filtreleme (filter): Belirli bir ölçüte göre verileri filtreler.
        // Haritalama (map): Verileri farklı bir yapıya veya tipe dönüştürür.
        // Sıralama (sorted): Verileri belirli bir sıralama kriterine göre sıralar.
        // Sınırlama (limit): İşlem sırasında sadece belirli bir sayıda veri alır.
        // Atlanma (skip): Belirli bir sayıda veriyi atlar.
        // Eşleştirme (matching): Verilerin belirli bir özelliği sağlayıp sağlamadığını kontrol eder.
        // Dönüşüm (reduction): Verileri tek bir değere dönüştürür (örneğin, toplama, çarpma, birleştirme vb.).


        List<Integer> integers = new ArrayList<>();

        integers.add(7);
        integers.add(7);
        integers.add(7);
        integers.add(7);
        integers.add(9);
        integers.add(34);
        integers.add(23);
        integers.add(29);
        integers.add(4);
        integers.add(67);
        integers.add(90);
        integers.add(11);

        // integers.stream().forEach(i -> System.out.println(i));

        // filter()
        // integers.stream().filter(num -> num > 60).forEach(num -> System.out.println(num));

        // distinct() uniq datalar ucun
        // integers.stream().distinct().forEach(num -> System.out.println(num));

        // sorted() datalari siralayir
        // integers.stream().sorted().forEach(num -> System.out.println(num));

        // sorted(Comparator.reverseOrder())   tersden siralayir
        // integers.stream().sorted(Comparator.reverseOrder()).forEach(num -> System.out.println(num));

        // limit() istediyimiz qeder data verir
        // integers.stream().limit(5).forEach(num -> System.out.println(num));

        // skip() daxil etdiyimiz qeder melumati bos buraxir
        // integers.stream().skip(5).forEach(num -> System.out.println(num));

        // count() dadlari sayir
        // long l = integers.stream().count();
        // System.out.println(l);

        // anyMatch elementin olub olmadigin yoxlayir
        // boolean control = integers.stream().anyMatch(i -> i == 4);
        // System.out.println(control);

        // son :)




    }
}
