package lesson39_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListQuestion_01 {
    public static void main(String[] args) {

        // Sual: istifadeciden deyer alaraq iki String liste yarad.
        // istifadeci deyer girmeyi buraxmaq ucun 0’a basmalidir.
        //	Iki liste yaradigdan sonra asagidaki sekilde bir output hazirlayin
        //		liste1 : …….
        //		liste2 : …….
        //		ortak elementler : …….

        System.out.println("Evel List1'i yaradaq");
        List<String> list1= istifadecidenAlarakListyarad();
        System.out.println("Indi ikinci listi yaradaq");
        List<String> list2= istifadecidenAlarakListyarad();

        System.out.println("List1 : " + list1);
        System.out.println("List2 : " + list2);
        list1.retainAll(list2);
        System.out.println("Ortaq elementler : " + list1);
    }

    private static List<String> istifadecidenAlarakListyarad() {
        // istifadeciden deyer alaraq String liste yaradib main method'a dondurecek
        // istifadeci deyer girmeyi buraxmaq ucun ucun 0’a basmalidir.

        List<String> adListi= new LinkedList<>();
        Scanner scan= new Scanner(System.in);
        String ad="";

        while (!ad.equalsIgnoreCase("0")){

            System.out.println("Listeye elave etmek ucun ad daxil edin \nBitirmek ucun 0'a basin");
            ad= scan.nextLine();

            if (!ad.equalsIgnoreCase("0")){
                adListi.add(ad);
            }
        }
        return adListi;
    }
}
