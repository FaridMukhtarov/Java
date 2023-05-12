package lesson20_MultiDimensionalArrays;

public class MDA_ElementleriToplama {
    public static void main(String[] args) {

        // Tek qatli array Cemi
        int [] arr = {4,6,5,9,};
        int toplama=0;

        for (int i = 0; i < arr.length; i++) {
            toplama += arr[i];
        }
        System.out.println("Tek Qatli Array Cemi: " + toplama);




        // Iki qatli array Cemi
        int [][] arr1 = {{2,5,6}, {9,5,2,1}, {5,6,}};
        toplama = 0;

        for (int i = 0; i < arr1.length; i++) { // outur

            for (int j = 0; j < arr1[i].length; j++) { // inner
                toplama += arr1[i][j];
            }
        }
        System.out.println("Iki qatli array cemi: " + toplama);
    }
}
