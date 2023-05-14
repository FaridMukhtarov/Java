package lesson24_StaticKeywordAndPassByValue;

import java.util.ArrayList;
import java.util.List;

public class PassByValueList_Question_1 {
    public static void main(String[] args) {

        // bir method yarad ve method-da list-deki reqemleri 5 artir
        // ve method-da listin son hallini yazdir

        List<Integer> reqemler = new ArrayList<>();
        reqemler.add(10);
        reqemler.add(20);
        reqemler.add(30);
        System.out.println(reqemler); // [10, 20, 30]

        elementleri5Artir(reqemler);
        System.out.println("Method call-dan sonra main method-da list: " + reqemler); // [15, 25, 35]
    }
    private static void elementleri5Artir(List<Integer> reqemler) {

        for (int i = 0; i < reqemler.size(); i++) {
            reqemler.set(i, reqemler.get(i) + 5);
        }
        System.out.println(reqemler);
    }
}
