package lesson18_Arrays;

public class ArrayElementCemi {
    public static void main(String[] args) {

        // Verilen bir int[] array’deki sayilari toplayip neticeni bize donduren bir
        // method yazin.

        int [] array = {3, 4, 3, 5, 6, 2, 7};
        arrayElemetCemi(array);
    }
    public static void arrayElemetCemi (int[] array){
        int cem = 0;

        for (int i = 0; i < array.length; i++) {
            cem += array[i];
        }
        System.out.println("Array-deki elementlerin cemi: " + cem);
    }
}
