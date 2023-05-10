package lesson18_Arrays;

public class ArraySayiTap {
    public static void main(String[] args) {

        // array-da nece eded cut sayi oldugunu yazdir

        int[] arr = {2,4,6,7,8,2,9,3,2};
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                flag++;
            }
        }
        System.out.println("Array-da (" + flag + ") eded cut sayi var");




        // array-da 3 ile bolune bilen nece eded oldugunu yazdir

        flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                flag++;
            }
        }
        System.out.println("Array-da 3 ile bolune bilen (" + flag + ") eded  sayi var");




        // verilen array-da 4 ile 8 (4 ve 8 daxil) nece eded sayi oldugunu yazdir
        flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 4 && arr[i] <= 8){
                flag++;
            }
        }
        System.out.println("Array-da 4 ile  8 arasinda (" + flag + ") eded  sayi var");
    }
}
