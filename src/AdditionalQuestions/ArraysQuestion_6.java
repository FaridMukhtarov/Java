package AdditionalQuestions;

public class ArraysQuestion_6 {
    public static void main(String[] args) {

        // Verilen String bir array-da ən uzun və ən qısa sözləri çap edən metod yaradın.

        String[] array = {"Ferid", "Gulnar", "Arzu", "Nizami", "Eldenniz"};
        enUzunEnQisa(array);
    }
    public static void enUzunEnQisa (String[] array) {
        String uzun = array[0];
        String qisa = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i].length() > uzun.length()) {
                uzun = array[i];
            }
            if (array[i].length() < qisa.length()) {
                qisa = array[i];
            }
        }
        System.out.println("En uzun soz: " + uzun);
        System.out.println("En qisa soz: " + qisa);
    }
}
