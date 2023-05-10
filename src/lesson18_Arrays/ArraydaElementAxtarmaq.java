package lesson18_Arrays;

public class ArraydaElementAxtarmaq {
    public static void main(String[] args) {

        // Verilen bir array’de istelinen bir elementin var olup olmadigini ve varsa ne qeder
        // stifade edildiyi yazdiran bir method yaradin.

        int[] arr = {2,4,6,7,8,2,9,3,2,67};
        int axtarilan = 67;

        elementAxtarmaq(arr,axtarilan);
    }
    public static void elementAxtarmaq(int[] arr, int axtarilan){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == axtarilan){
                count++;
            }
        }
        if ( count == 0){
            System.out.println("Axtardiginiz reqem Array-de yoxdur");
        }else
            System.out.println("Array-da axtarilan element " + axtarilan + " ve " + count + " defe istifade olunub");
    }
}
