package lesson39_Collections;

import java.util.*;

public class Collection {

    /*

    Java Collection, Java proqramlaşdırma dilində Data strukturlarının saxlanması,
    və manipulyasiyası üçün kitabxanadır. Java Collection, müəyyən data
    strukturlarını və bu data strukturlarından necə istifadə olunacağını müəyyənləşdirir.
    Bunlara List, Set, Queue , ve Map kimi data strukturları daxildir. Hər bir data strukturu
    müxtəlif məqsədlər üçün nəzərdə tutulmuşdur və müxtəlif əməliyyatları dəstəkləyir. Məsələn,
    LIST data strukturu, sıralı bir data dizisi olarak depolanan data-lari, dəstəkləyir,
    SET data-lar strukturu isə unikal məlumatları saxlamaq üçün nəzərdə tutulub.
    Java Collection, data-lari mütəşəkkil şəkildə idarə etməyi və manipulyasiya etməyi
    asanlaşdırmaqla proqramlaşdırma prosesini asanlaşdırır.

    Collections obyektləri (Objects) bir yerdə saxlayan strukturlardır.
    Gündəlik həyatda rast gəlinən vəziyyətlərdən irəli gələn ehtiyaclara görə müxtəlif collections strukturları mövcuddur.
    Tətbiqdə hansı collection-i istifadə edəcəyimizə onun xüsusiyyətinə görə qərar veririk.

        3 esas collection
            1-List
            2-Queue
            3-Set
            3 Interface ile qaydaları müəyyən edilir.

    İnterfeyslər-dən obyektlər yarada bilmədiyimiz üçün CHILD CLASS-laslardan conctructor-larini istifadə olunur.
    Özellikleri constructor'lar deyil DATA NOVU olarak seçtiyimiz collection belirler.

     */

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Vector<Integer> vector = new Vector<>();

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    }
}
