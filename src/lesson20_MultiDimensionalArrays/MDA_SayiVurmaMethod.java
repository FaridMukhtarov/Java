package lesson20_MultiDimensionalArrays;

public class MDA_SayiVurmaMethod {
    public static void main(String[] args) {

        // verilen 2 qatli array-deki olan
        // butun sayilari vuran bize donderen bir method yaradin

        int[][] arr =  {{5,7}, {5, 8, 9},{0,1}};
        System.out.println(elementlerVurmaMethod(arr));

    }
    public static int elementlerVurmaMethod (int[][] arr){
        int vurma = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                vurma *= arr[i][j];
            }
        }return vurma;
    }
}
