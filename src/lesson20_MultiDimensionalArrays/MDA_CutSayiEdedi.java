package lesson20_MultiDimensionalArrays;

public class MDA_CutSayiEdedi {
    public static void main(String[] args) {
        // verilen iki qatli int array-daki cut sayi ededini bolen kod yaz

        int[][] arr = {{4,6},{3,5,8},{1,0,4}};
        int sayan = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] %2==0){
                    sayan++;
                }
            }
        }
        System.out.println("Array-daki bolunen cut sayi ededi: " + sayan);
    }
}
