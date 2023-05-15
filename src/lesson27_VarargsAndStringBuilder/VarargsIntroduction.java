package lesson27_VarargsAndStringBuilder;

import java.util.Arrays;

public class VarargsIntroduction {
    public static void main(String[] args) {

        // Varargs (variable arguments) Java-da metoda müəyyən sayda arqument
        // götürməyə imkan verən xüsusiyyətdir. Varargs istifadə edərkən,
        // metod daxilindəki arqumentlərin sayı dəyişə bilər, bu da metodu istifadə
        // etmək üçün daha çevik edir. Varargs istifadə etmək üçün metodun parametrində "..."
        // istifadə olunur. Nümunə olaraq, aşağıdakı üsul bir neçə ədəd götürür:

        cem(10, 10); // 20
        uzunluq(4,7,3,4,9,0); // 6
        vurma(5,100,5,66); // 165000
        coxSayliParametir(4,3,4,"Ferid",3,4,5);
        stringVarargs("Ferid", "Fuad", "Ferahim", "Dunya");
    }

    // Metodda parametrlərin sayını məhdudlaşdırmaq istəmiriksə
    // standart variable əvəzinə Varargs (variable arguments) istifadə edirik
    // int... ==> qeyri-müəyyən sayda int parametrləri alan array-dir

    // public static void method(int... reqemler, int s, int t){
    // method'da parametir olaraq varargs varsa, son parametir olmasi MECBURIDIR
    // bu vezyetde bir method'da 2 varargs parametir OLMAZ

    public static void cem(int... reqemler) { // arrays kimi isleyir
        int toplama = 0;
        for (int reqem : reqemler) {
            toplama += reqem;
        }
        System.out.println("Daxil edilen reqemlerin Cemi: " + toplama);
    }
    public static void uzunluq (int... uzunluq){
        System.out.println("Daxil edilen reqemlerin Uzunluqu: " + uzunluq.length);
    }
    public static void vurma(int... reqemler){
        int vurma = 1;
        for (int reqem : reqemler) {
            vurma *= reqem;
        }
        System.out.println("Daxil edilen reqemlerin Vurmasi: " + vurma);
    }
    public static void coxSayliParametir(int a, int b, int c, String str, int... reqemler) {
        System.out.println(Arrays.toString(reqemler));

    }
    public static void stringVarargs (String ... name){
        System.out.println("Varargs Name: " + Arrays.toString(name) + " (Daxil edilen melumat sayi) " + name.length);
    }
}
