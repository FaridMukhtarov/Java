package lesson18_Arrays;

import java.util.Arrays;

public class ArrayEnBoyukVeEnKicikElement {
    public static void main(String[] args) {

        // verilen bir int arry-de en kicik ve
        // en boyuk sayilari yazdiran bir method yaradin

        int [] arr = {3,8,1,5,2,9,29,0};
        enBoyukVeKicikReqem(arr);
    }
    public static void enBoyukVeKicikReqem (int[] arr){
        Arrays.sort(arr);
        System.out.println("En Boyuk element: " + arr[arr.length-1]);
        System.out.println("En kicik element: " +arr[0]);
    }
}
