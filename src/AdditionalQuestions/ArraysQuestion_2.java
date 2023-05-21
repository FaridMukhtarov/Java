package AdditionalQuestions;

public class ArraysQuestion_2 {
    public static void main(String[] args) {

        // Verilmiş bir array-deki müsbət tam ədədləri toplayan və nəticəni yazdiran method yazın.

        int [] array = {4, 5, 8, 6, -4, 0, 9, -2, -7};
        musbetEdedToplama(array);
    }
    public static void musbetEdedToplama (int[] array) {
        int tomplama = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                tomplama += array[i];
            }
        }
        System.out.println("Musbet tam ededlerin toplami: " + tomplama);
    }
 }
