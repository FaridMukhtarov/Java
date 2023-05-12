package lesson22_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {3,6,2,4,9,0};
        int toplama = 0;

        // bur arra-da elementleri getir

        // bu array-deki butun elemntleri topla


        // mene arr-den her bir elementi getir. for each oxunmasi ucucn
        for (int each : arr) {
            if (each >5){
                toplama +=each;
            }
        }
        System.out.println(toplama);
    }
}
