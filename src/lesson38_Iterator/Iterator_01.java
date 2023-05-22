package lesson38_Iterator;

import java.util.ArrayList;
import java.util.List;

public class Iterator_01 {
    public static void main(String[] args) {

        /*
        Java-da iterator bir collection-un elementlərinə ardıcıl daxil olmaq üçün interfeysdir.
        Iterator interfeysinə hasNext() və next() metodları daxildir, onların köməyi ilə
        kolleksiyanın elementləri ardıcıl olaraq naviqasiya edilə bilər.
        Bu interfeys java.util.Iterator interfeysindən götürülüb.

        İterator interfeysi Java kolleksiyalarındakı hər bir elementin ayrıca skan edilməsi lazım
        olduqda istifadə olunur. Iterator interfeysi Collection class və onun alt class-lari tərəfindən
        dəstəklənir. Kolleksiyalara ArrayList, LinkedList, HashSet kimi class-lar daxildir və bu
        class-lar İterator interfeysini dəstəkləyir. İterator interfeysinin üstünlüyü kolleksiyaların
        elementlərinə ardıcıl olaraq daxil olmaq və elementlərin dəyişdirilməsi kimi əməliyyatları yerinə yetirməkdir.
         */


        // Java, collections icerisindeki bezi class'lar index desteklemez
        // Bu vezyetde index istifade etmeden collection icerisindeki butun  elementlere
        // catmaq ve onlari update edebilmek ucun ferqli ehtiyaclarimiz olur

        // List<> index quruluşunu desteklediyi ucun, bele bir seye ehtiytaci olmaz
        // ancaq bugunluk index istifade etmeden list' elementlerine catmaya
        // ve onlari update etmeye calisaq

        List<Integer> remler = new ArrayList<>();
        remler.add(10);
        remler.add(20);
        remler.add(30);
        remler.add(40);
        remler.add(50);

        // index istifade etmeden listin butun elementlerini yazdirin
        for (Integer reqem : remler){
            System.out.print(reqem + " ");
        }

        System.out.println();

        // index istifade etmeden listin butun elementlerini 1 artir
        // index istifade etmeden 25 den boyuk reqemleri silin

        for (Integer reqem : remler){
            System.out.print(reqem +1 + " ");
        }

        System.out.println();
        System.out.print(remler); // [10, 20, 30, 40, 50]


        // index istifade etmeden list-in elementlerini qalici olaraq deyisdirmek olmadi
        // Java bunun ucun iterator interface-i yaratmisdir
    }
}
