package lesson20_MultiDimensionalArrays;

public class MDA_sonElementCemiMethod {
    public static void main(String[] args) {

        // verilen 2 qatli array-deki olan
        // son elementlerin cemini hesabliyan method yaradin

        int[][] arr =  {{5,7}, {5, 8, 9},{0,1}};
        sonElementCemiMethod(arr);
    }
    public static void sonElementCemiMethod(int[][] arr) {
        int toplama = 0;
        for (int i = 0; i < arr.length; i++) {
            toplama += arr[i][arr[i].length - 1];
        }
        System.out.println("Array-in son elementlerin cemi: " + toplama);
    }
}
