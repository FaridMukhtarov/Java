package lesson21_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_IstfadeciyaListYaradmaq {
    public static void main(String[] args) {

        // istifadeciden istediye qeder ad alib
        // Q-ya basdiginda girdiyi adlar bize list olara
        // donen method yarad

        System.out.println(adListYarad());

    }
    public static List<String> adListYarad (){
        Scanner input = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        String daxilEdilenAd="";

        while (!daxilEdilenAd.equalsIgnoreCase("q")){
            System.out.println("Zehmet olmasa Liste-e elave edtmek ucun ad daxil edin" +
                    "\nBitirmek ucun Q basin");
            daxilEdilenAd = input.nextLine();

            if (!daxilEdilenAd.equalsIgnoreCase("q")){
                names.add(daxilEdilenAd);
            }
        }
        return names;
    }
}
