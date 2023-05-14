package lesson24_StaticKeywordAndPassByValue;

import java.util.ArrayList;
import java.util.List;

public class PassByValueList_Question_2 {
    public static void main(String[] args) {
        // bir method yarad
        // method-da yeni bir liste yarad
        // list-e reqemler list-indeki deyerlerin 5 artiq element olaraq elave edin
        // sonra reqemler listine deyer olaraq yeni listi elave edin
        // ve reqemler listini yazdirin

        List<Integer> reqemler = new ArrayList<>();
        reqemler.add(10);
        reqemler.add(20);
        reqemler.add(30);
        System.out.println(reqemler); // [10, 20, 30]

        yeniListDeyerAss(reqemler);
        System.out.println("Method call-dan sonra main method-da list: " + reqemler); //  [10, 20, 30]
    }

    private static void yeniListDeyerAss(List<Integer> reqemler) {

        // yeni list
        List<Integer> yeniList = new ArrayList<>();

        for (int i = 0; i <reqemler.size() ; i++) {
            yeniList.add(reqemler.get(i)+5);
        }
        reqemler = yeniList;
        System.out.println("Method-da reqemlerin son halli: " + reqemler);
    }
}
