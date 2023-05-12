package lesson20_MultiDimensionalArrays;

public class MDA_EnUzunKelme {
    public static void main(String[] args) {

        // Verilen Multi Dimensional String bir array-daki en uzun String-i yaz

        String [][] arr = {{"Farid","Arzu"}, {"Gulnar", "Mehemmed", "Vusale"}};
        String enUzunKelme = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if ( arr[i][j].length() > enUzunKelme.length()){
                    enUzunKelme = arr[i][j];
                }
            }
        }
        System.out.println("En Uzun Kelme: " + enUzunKelme);
    }
}
