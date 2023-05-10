package lesson18_Arrays;

public class ArrayEnBoyukEded {
    public static void main(String[] args) {

        // Verilen arra-deki en boyuk ededi bize donduren bir method yarad

        int[] arr = {2,4,6,7,8,2,9,3,2,67};
        System.out.println(enBoyukEded(arr));
    }
    public static int enBoyukEded (int[] array){
        int enBoyukEded = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > enBoyukEded){
                enBoyukEded = array[i];
            }
        }
        return enBoyukEded;
    }
}
