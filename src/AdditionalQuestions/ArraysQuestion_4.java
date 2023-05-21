package AdditionalQuestions;

public class ArraysQuestion_4 {
    public static void main(String[] args) {

        // İstədiyiniz elementin verilmiş array-da olub-olmadığını və əgər varsa,
        // ondan neçə dəfə istifadə olunduğunu çap edən metod yaradın.

        int[] array = {4, 5, 8, 6, 9, 0, 9, 54, 11, 3, 56, 4, 6};
        int axtarilan = 8;
        arraydaElementAxtarmaq(array, axtarilan);
    }
    public static void arraydaElementAxtarmaq (int[] array, int axtarilan){
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == axtarilan) {
                count++;
            }
        }
        if (count == 0){
            System.out.println("Axtardiginiz element array-de yoxdur");
        }else
            System.out.println("Axtarilan element array-da " + count + " defe istifade olunub");
    }
}
