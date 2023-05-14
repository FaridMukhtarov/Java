package lesson24_StaticKeywordAndPassByValue;

public class StaticBlocks {

         /*
            Static blok'lar class calismaya baslar baslamaz devreye girer
            tum diger kod'lardan HATTA main method'dan bile once calisirlar

            olur da main method calismadan once
            ayarlamamiz gereken bazi uyarlamalar varsa
            veya bazi variable'lara baslangic degerini atamak istiyorsak
            static blok'lar kullanilabilir

            birden fazla static blok varsa
            yukaridan asagi dogru sirali olarak calistirir

         */

        // Java-da bir Class-in ilk defe  yadasa yuklenmesiyle isledilen (Run)
        // bir kod blokudur,
        // Statik Variable-i işə salmaq və Class ilk dəfə yükləndikdə yerinə
        // yetirilməli olan digər tapşırıqları yerinə yetirmək üçün istifadə olunur.

        //Java-da statik blokun nümunəsi:

        static {
            System.out.println("1.static blok Isledi");
        }

        public static void main (String[]args){
            System.out.println("main method isledi");
        }

        static {
            System.out.println("2.static block isledi");
        }


        // Static blokdakı kod Class ilk run  edildikde bir dəfə işə salınır.
        // Main metodundan əvvəl yerinə yetirilir və Class-in hər hansı Object-i yaradılmazdan əvvəl işə salınır.
        // Bir Class-da birdən çox static blokunuz ola bilər və onlar kodda göründükləri ardıcıllıqla isleyecekler
        // Static bloklar tez-tez statik Variable-i işə salmaq üçün istifadə olunur,
        // məsələn:

        public static int myStaticVar;

        static {
            myStaticVar = 0;
        }
    }
